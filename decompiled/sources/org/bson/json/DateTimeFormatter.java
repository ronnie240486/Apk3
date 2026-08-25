package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
final class DateTimeFormatter {
    private static final org.bson.json.DateTimeFormatter.FormatterImpl FORMATTER_IMPL = null;

    /* JADX INFO: loaded from: classes2.dex */
    public interface FormatterImpl {
        java.lang.String format(long r1);

        long parse(java.lang.String r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Java8DateTimeFormatter implements org.bson.json.DateTimeFormatter.FormatterImpl {


        static {
                java.lang.String r0 = "java.time.format.DateTimeFormatter"
                java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L6
                return
            L6:
                r0 = move-exception
                java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
                r1.<init>(r0)
                throw r1
        }

        public Java8DateTimeFormatter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.bson.json.DateTimeFormatter.FormatterImpl
        public java.lang.String format(long r1) {
                r0 = this;
                java.time.Instant r1 = java.time.Instant.ofEpochMilli(r1)
                java.lang.String r2 = "Z"
                java.time.ZoneId r2 = java.time.ZoneId.of(r2)
                java.time.ZonedDateTime r1 = java.time.ZonedDateTime.ofInstant(r1, r2)
                java.time.format.DateTimeFormatter r2 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME
                java.lang.String r1 = r1.format(r2)
                return r1
        }

        @Override // org.bson.json.DateTimeFormatter.FormatterImpl
        public long parse(java.lang.String r3) {
                r2 = this;
                java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME     // Catch: java.time.format.DateTimeParseException -> L12
                org.bson.json.DateTimeFormatter$Java8DateTimeFormatter$1 r1 = new org.bson.json.DateTimeFormatter$Java8DateTimeFormatter$1     // Catch: java.time.format.DateTimeParseException -> L12
                r1.<init>()     // Catch: java.time.format.DateTimeParseException -> L12
                java.lang.Object r3 = r0.parse(r3, r1)     // Catch: java.time.format.DateTimeParseException -> L12
                java.time.Instant r3 = (java.time.Instant) r3     // Catch: java.time.format.DateTimeParseException -> L12
                long r0 = r3.toEpochMilli()     // Catch: java.time.format.DateTimeParseException -> L12
                return r0
            L12:
                r3 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.getMessage()
                r0.<init>(r3)
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class JaxbDateTimeFormatter implements org.bson.json.DateTimeFormatter.FormatterImpl {
        private static final java.lang.reflect.Method DATATYPE_CONVERTER_PARSE_DATE_TIME_METHOD = null;
        private static final java.lang.reflect.Method DATATYPE_CONVERTER_PRINT_DATE_TIME_METHOD = null;

        static {
                java.lang.String r0 = "javax.xml.bind.DatatypeConverter"
                java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L29 java.lang.NoSuchMethodException -> L30
                java.lang.String r2 = "parseDateTime"
                r3 = 1
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.ClassNotFoundException -> L29 java.lang.NoSuchMethodException -> L30
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r6 = 0
                r4[r6] = r5     // Catch: java.lang.ClassNotFoundException -> L29 java.lang.NoSuchMethodException -> L30
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.ClassNotFoundException -> L29 java.lang.NoSuchMethodException -> L30
                org.bson.json.DateTimeFormatter.JaxbDateTimeFormatter.DATATYPE_CONVERTER_PARSE_DATE_TIME_METHOD = r1     // Catch: java.lang.ClassNotFoundException -> L29 java.lang.NoSuchMethodException -> L30
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L29 java.lang.NoSuchMethodException -> L30
                java.lang.String r1 = "printDateTime"
                java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch: java.lang.ClassNotFoundException -> L29 java.lang.NoSuchMethodException -> L30
                java.lang.Class<java.util.Calendar> r3 = java.util.Calendar.class
                r2[r6] = r3     // Catch: java.lang.ClassNotFoundException -> L29 java.lang.NoSuchMethodException -> L30
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L29 java.lang.NoSuchMethodException -> L30
                org.bson.json.DateTimeFormatter.JaxbDateTimeFormatter.DATATYPE_CONVERTER_PRINT_DATE_TIME_METHOD = r0     // Catch: java.lang.ClassNotFoundException -> L29 java.lang.NoSuchMethodException -> L30
                return
            L29:
                r0 = move-exception
                java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
                r1.<init>(r0)
                throw r1
            L30:
                r0 = move-exception
                java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
                r1.<init>(r0)
                throw r1
        }

        public JaxbDateTimeFormatter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.bson.json.DateTimeFormatter.FormatterImpl
        public java.lang.String format(long r4) {
                r3 = this;
                java.util.Calendar r0 = java.util.Calendar.getInstance()
                r0.setTimeInMillis(r4)
                java.lang.String r4 = "Z"
                java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r4)
                r0.setTimeZone(r4)
                java.lang.reflect.Method r4 = org.bson.json.DateTimeFormatter.JaxbDateTimeFormatter.DATATYPE_CONVERTER_PRINT_DATE_TIME_METHOD     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L28
                r5 = 0
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L28
                r2 = 0
                r1[r2] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L28
                java.lang.Object r4 = r4.invoke(r5, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L28
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L28
                return r4
            L20:
                r4 = move-exception
                java.lang.Throwable r4 = r4.getCause()
                java.lang.RuntimeException r4 = (java.lang.RuntimeException) r4
                throw r4
            L28:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                r4.<init>()
                throw r4
        }

        @Override // org.bson.json.DateTimeFormatter.FormatterImpl
        public long parse(java.lang.String r5) {
                r4 = this;
                java.lang.reflect.Method r0 = org.bson.json.DateTimeFormatter.JaxbDateTimeFormatter.DATATYPE_CONVERTER_PARSE_DATE_TIME_METHOD     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L1c
                r1 = 0
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L1c
                r3 = 0
                r2[r3] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L1c
                java.lang.Object r5 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L1c
                java.util.Calendar r5 = (java.util.Calendar) r5     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L1c
                long r0 = r5.getTimeInMillis()     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L1c
                return r0
            L14:
                r5 = move-exception
                java.lang.Throwable r5 = r5.getCause()
                java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
                throw r5
            L1c:
                r5 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r5)
                throw r0
        }
    }

    static {
            java.lang.String r0 = "org.bson.json.DateTimeFormatter$Java8DateTimeFormatter"
            org.bson.json.DateTimeFormatter$FormatterImpl r0 = loadDateTimeFormatter(r0)     // Catch: java.lang.LinkageError -> L7
            goto Ld
        L7:
            java.lang.String r0 = "org.bson.json.DateTimeFormatter$JaxbDateTimeFormatter"
            org.bson.json.DateTimeFormatter$FormatterImpl r0 = loadDateTimeFormatter(r0)
        Ld:
            org.bson.json.DateTimeFormatter.FORMATTER_IMPL = r0
            return
    }

    private DateTimeFormatter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String format(long r1) {
            org.bson.json.DateTimeFormatter$FormatterImpl r0 = org.bson.json.DateTimeFormatter.FORMATTER_IMPL
            java.lang.String r1 = r0.format(r1)
            return r1
    }

    private static org.bson.json.DateTimeFormatter.FormatterImpl loadDateTimeFormatter(java.lang.String r2) {
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.NoSuchMethodException -> L1b java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L30
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.NoSuchMethodException -> L1b java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L30
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.NoSuchMethodException -> L1b java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L30
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.NoSuchMethodException -> L1b java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L30
            java.lang.Object r2 = r2.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.NoSuchMethodException -> L1b java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L30
            org.bson.json.DateTimeFormatter$FormatterImpl r2 = (org.bson.json.DateTimeFormatter.FormatterImpl) r2     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.NoSuchMethodException -> L1b java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L29 java.lang.ClassNotFoundException -> L30
            return r2
        L14:
            r2 = move-exception
            java.lang.ExceptionInInitializerError r0 = new java.lang.ExceptionInInitializerError
            r0.<init>(r2)
            throw r0
        L1b:
            r2 = move-exception
            java.lang.ExceptionInInitializerError r0 = new java.lang.ExceptionInInitializerError
            r0.<init>(r2)
            throw r0
        L22:
            r2 = move-exception
            java.lang.ExceptionInInitializerError r0 = new java.lang.ExceptionInInitializerError
            r0.<init>(r2)
            throw r0
        L29:
            r2 = move-exception
            java.lang.ExceptionInInitializerError r0 = new java.lang.ExceptionInInitializerError
            r0.<init>(r2)
            throw r0
        L30:
            r2 = move-exception
            java.lang.ExceptionInInitializerError r0 = new java.lang.ExceptionInInitializerError
            r0.<init>(r2)
            throw r0
    }

    public static long parse(java.lang.String r2) {
            org.bson.json.DateTimeFormatter$FormatterImpl r0 = org.bson.json.DateTimeFormatter.FORMATTER_IMPL
            long r0 = r0.parse(r2)
            return r0
    }
}
