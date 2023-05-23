#!/bin/sh

set -x

exec java -Dfile.encoding=UTF-8 $LOTUS_JAVA_OPS -jar /app/ehr-attendance-server-1.0.0-SNAPSHOT.jar