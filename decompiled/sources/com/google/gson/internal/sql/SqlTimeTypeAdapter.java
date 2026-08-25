package com.google.gson.internal.sql;

/* JADX INFO: loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Time> {
    public static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final java.text.DateFormat format;


    static {
            com.google.gson.internal.sql.SqlTimeTypeAdapter$1 r0 = new com.google.gson.internal.sql.SqlTimeTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.sql.SqlTimeTypeAdapter.FACTORY = r0
            return
    }

    private SqlTimeTypeAdapter() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "hh:mm:ss a"
            r0.<init>(r1)
            r2.format = r0
            return
    }

    public /* synthetic */ SqlTimeTypeAdapter(com.google.gson.internal.sql.SqlTimeTypeAdapter.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.sql.Time read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.sql.Time r1 = r0.read2(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public synchronized java.sql.Time read2(com.google.gson.stream.JsonReader r4) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            com.google.gson.stream.JsonToken r0 = r4.peek()     // Catch: java.lang.Throwable -> L2b
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.Throwable -> L2b
            if (r0 != r1) goto Lf
            r4.nextNull()     // Catch: java.lang.Throwable -> L2b
            r4 = 0
            monitor-exit(r3)
            return r4
        Lf:
            java.text.DateFormat r0 = r3.format     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            java.lang.String r4 = r4.nextString()     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            java.util.Date r4 = r0.parse(r4)     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            java.sql.Time r0 = new java.sql.Time     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            long r1 = r4.getTime()     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            r0.<init>(r1)     // Catch: java.text.ParseException -> L24 java.lang.Throwable -> L2b
            monitor-exit(r3)
            return r0
        L24:
            r4 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L2b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.sql.Time r2) throws java.io.IOException {
            r0 = this;
            java.sql.Time r2 = (java.sql.Time) r2
            r0.write2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public synchronized void write2(com.google.gson.stream.JsonWriter r2, java.sql.Time r3) throws java.io.IOException {
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
