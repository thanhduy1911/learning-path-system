# User Service

## Environment Setup

### Required Environment Variables
- `DB_URL`: Database connection URL
- `DB_USERNAME`: Database username
- `DB_PASSWORD`: Database password
- `JWT_SECRET`: Secret key for JWT (min 32 characters)

### Optional Environment Variables
- `SERVER_PORT`: Server port (default: 8081)
- `REDIS_HOST`: Redis host (default: localhost)
- `REDIS_PORT`: Redis port (default: 6379)
- `FEATURE_ENABLE_NEW_USER_REGISTRATION`: Enable new user registration (default: true)

### Setup Steps
1. Copy `.env.template` to `.env`
2. Update the values in `.env` with your configuration
3. Run the application

### Validation
The application will validate all required environment variables on startup.
If any validation fails, the application will not start and display appropriate error messages.

### Feature Flags
Feature flags can be controlled through environment variables.
See the documentation for a complete list of available feature flags.