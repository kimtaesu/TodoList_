#!/usr/bin/env bash
# docker build
docker build -t kimtaesoo/todoservice:1.1 .

# push to docker hub
docker push kimtaesoo/todoservice