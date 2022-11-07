# mongodb-spring-boot
> 🚨 create `environment` file and add permission to execute scripts
>
> ```shell
> cp .docker/.env.example .docker/.env && chmod -R +x .docker/scripts
> ```

- docker-compose for development
  - starting containers
  ```
  .docker/scripts/develop up -d
  ```
  
  - removing contaiers
  ```
  .docker/scripts/develop down
  ```

  - show backend logs
  ```
  .docker/scripts/develop logs -f api
  ```
