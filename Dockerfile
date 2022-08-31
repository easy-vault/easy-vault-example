FROM ghcr.io/easy-vault/easy-vault:latest AS vault_client
FROM adoptopenjdk/openjdk11:latest
COPY target/spring-boot-example-0.0.1.jar app.jar
COPY build.sh .
COPY --from=vault_client vault/ .
RUN chmod 777 build.sh easyvault.sh
COPY src/main/resources/vault.yaml .
ENTRYPOINT ["/bin/bash","-c","./build.sh"]
