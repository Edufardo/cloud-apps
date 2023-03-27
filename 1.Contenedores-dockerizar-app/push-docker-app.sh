#!/usr/bin/env bash
# Use this script to test if a given TCP host/port are available

if build
  ./planner/ docker build -f multistage.Dockerfile .
  ./server/ ./mvnw install
  ./toposervice/ mvn spring-boot:build-image
  ./weatherservice/ ./mvnw install

if push
  build
  docker login -u -p
  docker push planner-multistage:v1
  docker push server-pr-docker:v1
  docker push toposervice:v1
  docker push weatherservice-pr-docker:v1 