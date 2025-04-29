CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

create table public.threads(
    "code" UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    "user_code" UUID NOT NULL,
    "title" TEXT NOT NULL,
    "image_file_code" UUID,
    "created_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT threads_user_code_fk FOREIGN KEY (user_code) REFERENCES users(code) ON DELETE CASCADE,
    CONSTRAINT threads_file_code_fk FOREIGN KEY (image_file_code) REFERENCES files(code) ON DELETE SET NULL
);
