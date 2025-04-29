CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

create table public.responses(
    "code" UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    "thread_code" UUID NOT NULL,
    "user_code" UUID NOT NULL,
    "sentence" TEXT NOT NULL,
    "image_file_code" UUID,
    "created_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT responses_thread_code_fk FOREIGN KEY (thread_code) REFERENCES threads(code) ON DELETE CASCADE,
    CONSTRAINT responses_user_code_fk FOREIGN KEY (user_code) REFERENCES users(code) ON DELETE CASCADE,
    CONSTRAINT responses_file_code_fk FOREIGN KEY (image_file_code) REFERENCES files(code) ON DELETE SET NULL
);
