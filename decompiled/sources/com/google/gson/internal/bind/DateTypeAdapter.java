package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTypeAdapter extends com.google.gson.TypeAdapter<java.util.Date> {
    public static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final java.util.List<java.text.DateFormat> dateFormats;


    static {
            com.google.gson.internal.bind.DateTypeAdapter$1 r0 = new com.google.gson.internal.bind.DateTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.bind.DateTypeAdapter.FACTORY = r0
            return
    }

    public DateTypeAdapter() {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.dateFormats = r0
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.text.DateFormat r3 = java.text.DateFormat.getDateTimeInstance(r2, r2, r1)
            r0.add(r3)
            java.util.Locale r3 = java.util.Locale.getDefault()
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L25
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r2, r2)
            r0.add(r1)
        L25:
            boolean r1 = com.google.gson.internal.JavaVersion.isJava9OrLater()
            if (r1 == 0) goto L32
            java.text.DateFormat r1 = com.google.gson.internal.PreJava9DateFormatProvider.getUSDateTimeFormat(r2, r2)
            r0.add(r1)
        L32:
            return
    }

    private synchronized java.util.Date deserializeToDate(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r2.dateFormats     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2c
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2c
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L2c
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L7 java.lang.Throwable -> L2c
            monitor-exit(r2)
            return r3
        L19:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L25 java.lang.Throwable -> L2c
            r1 = 0
            r0.<init>(r1)     // Catch: java.text.ParseException -> L25 java.lang.Throwable -> L2c
            java.util.Date r3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(r3, r0)     // Catch: java.text.ParseException -> L25 java.lang.Throwable -> L2c
            monitor-exit(r2)
            return r3
        L25:
            r0 = move-exception
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2c
            throw r1     // Catch: java.lang.Throwable -> L2c
        L2c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.util.Date read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.util.Date r1 = r0.read2(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.util.Date read2(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
            r2 = this;
            com.google.gson.stream.JsonToken r0 = r3.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto Ld
            r3.nextNull()
            r3 = 0
            return r3
        Ld:
            java.lang.String r3 = r3.nextString()
            java.util.Date r3 = r2.deserializeToDate(r3)
            return r3
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.util.Date r2) throws java.io.IOException {
            r0 = this;
            java.util.Date r2 = (java.util.Date) r2
            r0.write2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public synchronized void write2(com.google.gson.stream.JsonWriter r3, java.util.Date r4) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            if (r4 != 0) goto L8
            r3.nullValue()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            return
        L8:
            java.util.List<java.text.DateFormat> r0 = r2.dateFormats     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1a
            java.text.DateFormat r0 = (java.text.DateFormat) r0     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = r0.format(r4)     // Catch: java.lang.Throwable -> L1a
            r3.value(r4)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            return
        L1a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
