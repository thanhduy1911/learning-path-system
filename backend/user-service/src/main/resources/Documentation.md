# Environment Variables Documentation

## Database Configuration
| Variable | Description | Required | Default | Validation |
|----------|-------------|----------|---------|------------|
| DB_URL | Database connection URL | Yes | - | Not blank |
| DB_USERNAME | Database username | Yes | - | Not blank |
| DB_PASSWORD | Database password | Yes | - | Not blank |

## Server Configuration
| Variable | Description | Required | Default | Validation |
|----------|-------------|----------|---------|------------|
| SERVER_PORT | Server port number | No | 8081 | 1-65535 |

## Redis Configuration
| Variable | Description | Required | Default | Validation |
|----------|-------------|----------|---------|------------|
| REDIS_HOST | Redis server host | Yes | localhost | Not blank |
| REDIS_PORT | Redis server port | No | 6379 | 1-65535 |
| REDIS_PASSWORD | Redis password | No | - | - |

## JWT Configuration
| Variable       | Description                | Required | Default  | Validation   |
|----------------|----------------------------|----------|----------|--------------|
| JWT_SECRET     | Secret key for JWT         | Yes      | -        | Min 32 chars |
| JWT_EXPIRATION | Token expiration time (ms) | No       | 86400000 | Min 1000ms   |

## Feature Flags
| Variable                             | Description                      | Required | Default | Validation |
|--------------------------------------|----------------------------------|----------|---------|------------|
| FEATURE_ENABLE_NEW_USER_REGISTRATION | Enable new user registration     | No       | true    | boolean    |
| FEATURE_ENABLE_EMAIL_VERIFICATION    | Enable email verification        | No       | true    | boolean    |
| FEATURE_ENABLE_2FA                   | Enable two-factor authentication | No       | false   | boolean    |
| FEATURE_ENABLE_SOCIAL_LOGIN          | Enable social login              | No       | true    | boolean    |
| FEATURE_MAINTENANCE_MODE             | Enable maintenance mode          | No       | false   | boolean    |
| FEATURE_BETA_FEATURES                | Enable beta features             | No       | false   | boolean    |