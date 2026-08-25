package com.google.gson.internal.sql;

/* JADX INFO: loaded from: classes3.dex */
final class SqlDateTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Date> {
    public static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final java.text.DateFormat format;


    static {
            com.google.gson.internal.sql.SqlDateTypeAdapter$1 r0 = new com.google.gson.internal.sql.SqlDateTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.sql.SqlDateTypeAdapter.FACTORY = r0
            return
    }

    private SqlDateTypeAdapter() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "MMM d, yyyy"
            r0.<init>(r1)
            r2.format = r0
            return
    }

    public /* synthetic */ SqlDateTypeAdapter(com.google.gson.internal.sql.SqlDateTypeAdapter.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.sql.Date read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.sql.Date r1 = r0.read2(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public synchronized java.sql.Date read2(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            com.google.gson.stream.JsonToken r0 = r3.peek()     // Catch: java.lang.Throwable -> L2b
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.Throwable -> L2b
            if (r0 != r1) goto Lf
            r3.nextNull()     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            monitor-exit(r2)
            return r3
        Lf:
            java.text.DateFormat r0 = r2.format     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            java.lang.String r3 = r3.nextString()     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            java.util.Date r3 = r0.parse(r3)     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            long r0 = r3.getTime()     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            java.sql.Date r3 = new java.sql.Date     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            r3.<init>(r0)     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            monitor-exit(r2)
            return r3
        L24:
            r3 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L2b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.sql.Date r2) throws java.io.IOException {
            r0 = this;
            java.sql.Date r2 = (java.sql.Date) r2
            r0.write2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public synchronized void write2(com.google.gson.stream.JsonWriter r2, java.sql.Date r3) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto L5
            r3 = 0
            goto Lb
        L5:
            java.text.DateFormat r0 = r1.format     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = r0.format(r3)     // Catch: java.lang.Throwable -> L10
        Lb:
            r2.value(r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
