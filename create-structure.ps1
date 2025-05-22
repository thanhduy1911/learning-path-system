# Backend structure
$backendPaths = @(
    "backend/src/main/java/com/learningpath/config",
    "backend/src/main/java/com/learningpath/domain/entity",
    "backend/src/main/java/com/learningpath/domain/dto",
    "backend/src/main/java/com/learningpath/domain/mapper",
    "backend/src/main/java/com/learningpath/repository",
    "backend/src/main/java/com/learningpath/service/impl",
    "backend/src/main/java/com/learningpath/service/interfaces",
    "backend/src/main/java/com/learningpath/controller",
    "backend/src/main/java/com/learningpath/security/config",
    "backend/src/main/java/com/learningpath/security/jwt",
    "backend/src/main/java/com/learningpath/security/service",
    "backend/src/main/java/com/learningpath/exception/handler",
    "backend/src/main/java/com/learningpath/exception/custom",
    "backend/src/main/java/com/learningpath/util"
)

# Frontend structure
$frontendPaths = @(
    "frontend/app/auth",
    "frontend/app/dashboard",
    "frontend/components/common",
    "frontend/components/features",
    "frontend/components/layouts",
    "frontend/lib/api",
    "frontend/lib/hooks",
    "frontend/lib/utils",
    "frontend/lib/types",
    "frontend/public",
    "frontend/styles"
)

# Create directories and .gitkeep files
foreach ($path in $backendPaths + $frontendPaths) {
    # Create directory if it doesn't exist
    if (-not (Test-Path $path)) {
        New-Item -ItemType Directory -Path $path -Force
    }
    
    # Create .gitkeep file
    New-Item -ItemType File -Path "$path/.gitkeep" -Force
}

# Create docs directory if it doesn't exist
if (-not (Test-Path "docs")) {
    New-Item -ItemType Directory -Path "docs" -Force
    New-Item -ItemType File -Path "docs/.gitkeep" -Force
} 