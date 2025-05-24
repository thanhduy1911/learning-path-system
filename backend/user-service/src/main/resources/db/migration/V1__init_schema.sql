-- Tạo bảng users
CREATE TABLE users (
                       id BIGSERIAL PRIMARY KEY,
                       username VARCHAR(50) UNIQUE NOT NULL,
                       email VARCHAR(255) UNIQUE NOT NULL,
                       password_hash VARCHAR(255) NOT NULL,
                       full_name VARCHAR(100),
                       avatar_url VARCHAR(255),
                       bio TEXT,
                       status VARCHAR(20) DEFAULT 'ACTIVE',
                       email_verified BOOLEAN DEFAULT FALSE,
                       created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                       updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                       last_login_at TIMESTAMP WITH TIME ZONE,
                       created_by BIGINT,
                       updated_by BIGINT,
                       version INTEGER DEFAULT 0,
                       is_deleted BOOLEAN DEFAULT FALSE
);

-- Tạo bảng roles
CREATE TABLE roles (
                       id BIGSERIAL PRIMARY KEY,
                       name VARCHAR(50) UNIQUE NOT NULL,
                       description TEXT,
                       created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                       updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                       created_by BIGINT REFERENCES users(id),
                       updated_by BIGINT REFERENCES users(id),
                       version INTEGER DEFAULT 0,
                       is_deleted BOOLEAN DEFAULT FALSE
);

-- Tạo bảng permissions
CREATE TABLE permissions (
   id BIGSERIAL PRIMARY KEY,
   name VARCHAR(100) UNIQUE NOT NULL,
   description TEXT,
   created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
   updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
   created_by BIGINT REFERENCES users(id),
   updated_by BIGINT REFERENCES users(id),
   version INTEGER DEFAULT 0,
   is_deleted BOOLEAN DEFAULT FALSE
);

-- Tạo bảng user_roles
CREATE TABLE user_roles (
    user_id BIGINT REFERENCES users(id),
    role_id BIGINT REFERENCES roles(id),
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    created_by BIGINT REFERENCES users(id),
    PRIMARY KEY (user_id, role_id)
);

-- Tạo bảng role_permissions
CREATE TABLE role_permissions (
    role_id BIGINT REFERENCES roles(id),
    permission_id BIGINT REFERENCES permissions(id),
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    created_by BIGINT REFERENCES users(id),
    PRIMARY KEY (role_id, permission_id)
);