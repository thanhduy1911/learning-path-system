# Learning Path System

## Giới thiệu
Learning Path System là một nền tảng web được thiết kế để cung cấp lộ trình học tập được cá nhân hóa, dựa trên AI và hỗ trợ người dùng trong việc phát triển các kỹ năng đa dạng. Hệ thống tập trung vào việc tạo ra trải nghiệm học tập tùy chỉnh cho từng cá nhân, kết hợp với tính năng cộng đồng để tăng cường động lực học tập.

## Công nghệ sử dụng

### Backend
- **Core**: 
  - Java 21 (Latest LTS)
  - Spring Boot 3.x
  - Spring Cloud
  - Spring Security
  - Spring Data JPA
  - Spring WebFlux (Reactive Programming)
- **IAM**: 
  - Keycloak/Auth0
  - OIDC Provider
  - Custom Authorization Server

### Frontend
- **Framework**: Next.js 14 (App Router)
- **Language**: TypeScript
- **Styling**: TailwindCSS
- **State Management**: Redux Toolkit
- **Testing**: Jest, React Testing Library
- **Build Tool**: Vite
- **PWA Support**: 
  - Service Workers
  - Offline Capability
  - Push Notifications
- **GraphQL**: Apollo Client
- **Voice Interaction**: Web Speech API

### Database & Cache
- **Primary Database**: PostgreSQL 16
- **Cache**: Redis  
- **Search Engine**: Elasticsearch
- **Message Queue**: Apache Kafka
- **Time Series DB**: InfluxDB (for metrics)

### DevOps & Infrastructure
- **Containerization**: Docker
- **Orchestration**: Kubernetes
- **CI/CD**: GitHub Actions
- **IaC**: Terraform
- **Service Mesh**: Istio
- **API Gateway**: Spring Cloud Gateway

### Cloud Services (AWS)
- **Compute**: EKS (Kubernetes)
- **Storage**: S3
- **CDN**: CloudFront
- **DNS**: Route53
- **Load Balancer**: ALB
- **Secrets**: AWS Secrets Manager

### Monitoring & Logging
- **APM**: New Relic
- **Metrics**: Prometheus + Grafana
- **Logging**: ELK Stack
- **Tracing**: Jaeger
- **Alerting**: PagerDuty

### Special Features
- **AI/ML**: 
  - OpenAI API Integration
  - TensorFlow/DL4J
  - ML Model Deployment
- **Real-time**: 
  - WebSocket
  - Server-Sent Events
- **Payment**: 
  - Stripe Integration
  - PayPal Integration
- **Location**: 
  - Google Maps API
  - Geolocation Services

## Kiến trúc hệ thống
```
learning-path-system/
├── frontend/
│   ├── app/
│   ├── components/
│   ├── lib/
│   ├── hooks/
│   ├── store/
│   └── types/
├── backend/
│   ├── api-gateway/
│   ├── auth-service/
│   ├── user-service/
│   ├── learning-service/
│   ├── notification-service/
│   ├── payment-service/
│   ├── analytics-service/
│   ├── qa-service/
│   ├── ranking-service/
│   ├── achievement-service/
│   ├── ai-service/
│   └── common/
│       ├── domain/
│       ├── infrastructure/
│       └── util/
├── infrastructure/
│   ├── terraform/
│   ├── kubernetes/
│   ├── docker/
│   └── ci-cd/
└── docs/
```

## Best Practices

### Architecture & Design
- Clean Architecture (Hexagonal/Ports & Adapters)
- Domain-Driven Design (DDD)
- SOLID Principles
- Design Patterns Implementation
- Event-Driven Architecture
- CQRS Pattern
- Saga Pattern for Distributed Transactions
- GraphQL Federation cho Frontend Flexibility
- CQRS với Event Sourcing cho Real-time Features
- Feature Flags cho A/B Testing
- Multi-layer Caching Strategy
- Session Management & Recovery
- Voice Processing Pipeline

### Development
- Test-Driven Development (TDD)
- Behavior-Driven Development (BDD)
- Continuous Integration/Deployment
- Code Review Process
- Feature Toggles
- API-First Development
- Contract Testing
- Feature Toggle Management
- A/B Testing Framework
- Performance Budgets
- Accessibility Standards (WCAG)
- Progressive Enhancement
- Mobile-first Approach

### Testing Strategy
- Unit Testing (JUnit 5, Mockito)
- Integration Testing (TestContainers)
- E2E Testing (Selenium)
- Performance Testing (JMeter)
- Security Testing (OWASP ZAP)
- Contract Testing (Spring Cloud Contract)
- Chaos Testing

### Security
- OAuth2 & JWT Implementation
- Role-Based Access Control (RBAC)
- API Security (Rate Limiting, CORS)
- Data Encryption (at rest & in transit)
- Secrets Management
- Security Headers Configuration
- Regular Security Audits

### Database
- Database Migration (Flyway)
- Connection Pooling (HikariCP)
- Query Optimization
- Indexing Strategy
- Caching Strategy (Multi-level)
- Data Partitioning
- Backup & Recovery Strategy

### Monitoring & Operations
- Health Checks
- Circuit Breakers (Resilience4j)
- Rate Limiting
- Distributed Tracing
- Log Aggregation
- Metrics Collection
- Alerting Strategy

### Infrastructure
- GitOps với ArgoCD
- Canary Deployments với Spinnaker
- Service Mesh Policy Management
- Multi-region Deployment
- Edge Computing Setup
- CDN Optimization

### Caching Strategy
- Multi-level Cache (Browser, CDN, Application, Database)
- Cache Invalidation Patterns
- AI Suggestion Caching
- User Session Caching
- Content Delivery Optimization
- Distributed Cache Management

### Data Management
- Version Control cho Content
- Audit Logging
- Data Retention Policies
- GDPR Compliance Tools
- Data Recovery Procedures
- Backup Automation

### Performance Optimization
- Lazy Loading Patterns
- Image Optimization
- Bundle Optimization
- Server-side Rendering
- Progressive Loading
- Resource Prioritization

### Mobile & PWA
- Offline First Design
- Push Notification System
- App Shell Architecture
- Background Sync
- Install Prompts
- Device API Integration

## Tính năng chính

### 1. Quản lý Learning Path
- Tạo và quản lý lộ trình học tập cá nhân hóa
- Tích hợp AI để đề xuất nội dung học tập
- Theo dõi tiến độ học tập
- Hệ thống nhắc nhở và động viên
- Version Control cho Roadmap
- AI Personalization cho từng lĩnh vực
- Voice-based Learning Interface
- Resume Learning Feature

### 2. Nội dung học tập đa dạng
- Roadmap cho nhiều lĩnh vực (IT, ngoại ngữ, thể thao,...)
- Tài liệu học tập có cấu trúc
- Liên kết với các nguồn học tập bên ngoài
- Blog chia sẻ kiến thức
- Q&A System với AI Support
- Rating và Review System
- Version History cho Blogs
- Voice-to-Text cho Content Creation

### 3. Tính năng cộng đồng
- Tạo và tham gia nhóm học tập
- Chat nhóm theo địa phương
- Đăng ký học offline
- Chia sẻ kinh nghiệm
- Hệ thống Ranking và Leaderboard
- Badge và Achievement System
- Mentor-Mentee Matching
- Community-driven Content Moderation

### 4. Time Management
- Pomodoro Timer Integration
- Eisenhower Matrix Planning
- Calendar Integration
- Study Session Analytics
- Flexible Schedule Management

### 5. Gamification & Engagement
- Achievement System
- Progress Tracking
- Social Challenges
- Learning Streaks
- Point System
- Ranking Leaderboards
- Custom Badges
- Monthly Competitions

### 6. AI & Personalization
- AI-powered Q&A System
- Personalized Learning Paths
- Content Recommendations
- Study Pattern Analysis
- Voice Interaction
- Nutrition & Exercise Planning
- Progress Prediction
- Adaptive Learning

## API Documentation

### Authentication API
```java
POST /api/auth/login
POST /api/auth/register
GET /api/auth/user
POST /api/auth/refresh-token
```

### Learning Path API
```java
GET /api/paths
POST /api/paths
GET /api/paths/{id}
PUT /api/paths/{id}
DELETE /api/paths/{id}
```

### Community API
```java
GET /api/groups
POST /api/groups
GET /api/groups/{id}/members
POST /api/groups/{id}/join
```

## Hướng dẫn cài đặt

1. Yêu cầu hệ thống
```bash
- Java 17 hoặc cao hơn
- Maven 3.8+
- Node.js 18+
- PostgreSQL 15+
```

2. Clone repository
```bash
git clone https://github.com/yourusername/learning-path-system.git
```

3. Cài đặt Backend
```bash
cd learning-path-system/backend
mvn clean install
```

4. Cài đặt Frontend
```bash
cd ../frontend
npm install
```

5. Cấu hình môi trường
```bash
# Backend
cp backend/src/main/resources/application.properties.example backend/src/main/resources/application.properties
# Cập nhật các thông số cấu hình

# Frontend
cp frontend/.env.example frontend/.env
# Cập nhật các biến môi trường
```

6. Chạy ứng dụng
```bash
# Backend
cd backend
mvn spring-boot:run

# Frontend
cd frontend
npm run dev
```

## Contributing
Vui lòng đọc [CONTRIBUTING.md](CONTRIBUTING.md) để biết thêm chi tiết về quy trình đóng góp code.

## License
MIT License - xem [LICENSE.md](LICENSE.md) để biết thêm chi tiết. 