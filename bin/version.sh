#!/bin/bash

error_exit() {
    echo "$1" >&2
    exit 1
}

# Check version file
[ -e "version" ] || error_exit "The file 'version' does not exist."

# Get version from file
current_version=$(head -n 1 "version")

# Verifi version regex
[[ $current_version =~ ^[0-9]+\.[0-9]+\.[0-9]+$ ]] || error_exit "Invalid version: $current_version"

# get commit name from args
commit="$1"

# get commit prefix
commit_prefix="${commit%%:*}"

# check commit prefix
if [ "$commit_prefix" == "feat" ]; then
    # get second version
    second_version=$(echo "$current_version" | cut -d '.' -f 2)

    # add version
    ((new_second_version = second_version + 1))

    # get new version
    # shellcheck disable=SC2001
    new_version=$(echo "$current_version" | sed "s/\.[0-9]\{1,\}\.[0-9]*$/.$new_second_version.0/")

    # insert new version in file version
    echo "$new_version" > "version"
else
    # get second version
    third_version=$(echo "$current_version" | cut -d '.' -f 3)

    # add version
    ((new_third_version = third_version + 1))

    # get new version
    # shellcheck disable=SC2001
    new_version=$(echo "$current_version" | sed "s/\.[0-9]*$/.$new_third_version/")

    # insert new version in file version
    echo "$new_version" > "version"
fi
echo "$new_version"
#echo "{new_version}={$new_version}" >> $GITHUB_OUTPUT