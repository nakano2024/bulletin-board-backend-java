CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

create table public.users(
    "code" UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    "id" VARCHAR(64) NOT NULL,
    "ip_address" VARCHAR(64) NOT NULL,
    "name" VARCHAR(32) NOT NULL,
    "created_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
