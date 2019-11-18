#!/bin/bash

# Baixe o pattern4.jar a partir do seguinte site:
#   https://users.encs.concordia.ca/~nikolaos/pattern_detection.html
# Link direto para download:
#  https://users.encs.concordia.ca/~nikolaos/files/pattern_detection/pattern4.jar
#
# Se a saída for 1 1, seu programa contém ambos os padrões solicitados
#

java -jar /opt/pattern4.jar -target bin -output out.xml

temDecorator=0
temComposite=0

egrep '"Decorator.*element=' out.xml > /dev/null
if [[ $? == 0 ]]; then
	temDecorator=1
fi
egrep '"Composite".*element=' out.xml > /dev/null
if [[ $? == 0 ]]; then
	temComposite=1
fi

echo $temDecorator $temComposite

