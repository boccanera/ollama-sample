# REQUIREMENTS
4GB RAM~

# DOCKER (option 1)

docker compose -f docker-compose.yml up

docker exec -it ollama ollama run deepseek-r1:1.5b

# INSTALL (option 2)

install ollama https://ollama.com/download

write in terminal: run deepseek-r1:1.5b

run spring application

# HAVE FUN

import the curl in postman or other tool: curl --location 'localhost:8080/deepseek/api/v1/generate?input=whats%20the%20collor%20of%20the%20sky%3F'

# OTHER'S MODELS

If you want to run other model, you must run 'ollama run deepseek-r1:8b' and change the 'OllamaOptions.builder()
.model("deepseek-r1:8b")' This model requires 8GB RAM~.