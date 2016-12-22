<#!/bin/bash
set -e
for dir in */ ; do
  cd $dir
  mvn clean verify -P jetty7x
  cd ..
done
