#!/bin/bash
set -e
for dir in */ ; do
  cd $dir
  mvn clean verify
  cd ..
done
