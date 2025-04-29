CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

create table public.files(
    "code" UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    "name" VARCHAR(128) NOT NULL,
    "url" VARCHAR(256) NOT NULL,
    "created_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
