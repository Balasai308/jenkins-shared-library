def call(String appName) {
    echo "Starting build for ${appName} 🚀"
    
    sh "echo Building ${appName}..."
    sh "sleep 2"
    
    echo "Build completed for ${appName} ✅"
}
