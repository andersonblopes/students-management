create TABLE "public"."student"
(
    "id"              SERIAL,
    "first_name"      TEXT    NOT NULL,
    "last_name"       TEXT    NOT NULL,
    "email"           TEXT    NOT NULL,
    "active"          BOOLEAN NOT NULL DEFAULT 'true',
    "created_at"         TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT "student_pk" PRIMARY KEY ("id")
);
