package org.iti;

def login(USERNAME, PASSWORD){
    sh "docker login -u ${USERNAME} -p ${PASSWORD}"
}

def build(IMAGE_NAME, IMAGE_TAG){
    sh "docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
}

def push(USER_NAME,IMAGE_NAME, IMAGE_TAG){
    sh "docker tag ${IMAGE_NAME}:${IMAGE_TAG} ${USER_NAME}/${IMAGE_NAME}:${IMAGE_TAG}"
    sh "docker push ${USER_NAME}/${IMAGE_NAME}:${IMAGE_TAG}"
}