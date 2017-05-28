FROM alpine:3.5

#================================================
# Add packages
#================================================
RUN apk add --update \
    openjdk8-jre \
    wget \
  && rm -rf /var/cache/apk/*

#================================================
# Download gemfire and unzip
# Also change shebang to use Bourne shell
# NOTE: Use your API Token where it says <API Token>
#   And make sure to have accepted the EULA!
#================================================
RUN wget --no-verbose -O "gemfire.tar.gz" --header="Authorization: Token <API Token>" \
    https://network.pivotal.io/api/v2/products/pivotal-gemfire/releases/5376/product_files/20296/download \
  && mkdir -p /usr/lib/pivotal/ \
  && tar -xzvf gemfire.tar.gz -C /usr/lib/pivotal/ \
  && rm -rf gemfire.tar.gz \
    /tmp/* \
  && apk del wget \
  && sed -i "1s/.*/\#\!\/bin\/sh/" /usr/lib/pivotal/pivotal-gemfire-9.0.4/bin/gfsh
    
#================================================
# Set up environmet variables
#================================================
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV GEMFIRE /usr/lib/pivotal/pivotal-gemfire-9.0.4
ENV GF_JAVA $JAVA_HOME/bin/java
ENV PATH $JAVA_HOME/jre/bin:$JAVA_HOME/java-1.8-openjdk/bin:$GEMFIRE/bin:$PATH

# For pulse
EXPOSE 7070

WORKDIR /gemfire
ENTRYPOINT ["gfsh"]
