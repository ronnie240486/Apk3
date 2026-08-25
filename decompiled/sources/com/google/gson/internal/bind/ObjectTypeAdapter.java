package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes3.dex */
public final class ObjectTypeAdapter extends com.google.gson.TypeAdapter<java.lang.Object> {
    private static final com.google.gson.TypeAdapterFactory DOUBLE_FACTORY = null;
    private final com.google.gson.Gson gson;
    private final com.google.gson.ToNumberStrategy toNumberStrategy;


    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;

        static {
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    static {
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.DOUBLE
            com.google.gson.TypeAdapterFactory r0 = newFactory(r0)
            com.google.gson.internal.bind.ObjectTypeAdapter.DOUBLE_FACTORY = r0
            return
    }

    private ObjectTypeAdapter(com.google.gson.Gson r1, com.google.gson.ToNumberStrategy r2) {
            r0 = this;
            r0.<init>()
            r0.gson = r1
            r0.toNumberStrategy = r2
            return
    }

    public /* synthetic */ ObjectTypeAdapter(com.google.gson.Gson r1, com.google.gson.ToNumberStrategy r2, com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.TypeAdapterFactory getFactory(com.google.gson.ToNumberStrategy r1) {
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.DOUBLE
            if (r1 != r0) goto L7
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.ObjectTypeAdapter.DOUBLE_FACTORY
            return r1
        L7:
            com.google.gson.TypeAdapterFactory r1 = newFactory(r1)
            return r1
    }

    private static com.google.gson.TypeAdapterFactory newFactory(com.google.gson.ToNumberStrategy r1) {
            com.google.gson.internal.bind.ObjectTypeAdapter$1 r0 = new com.google.gson.internal.bind.ObjectTypeAdapter$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.gson.TypeAdapter
    public java.lang.Object read(com.google.gson.stream.JsonReader r4) throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.JsonToken r0 = r4.peek()
            int[] r1 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L4d;
                case 2: goto L2f;
                case 3: goto L2a;
                case 4: goto L23;
                case 5: goto L1a;
                case 6: goto L15;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L15:
            r4.nextNull()
            r4 = 0
            return r4
        L1a:
            boolean r4 = r4.nextBoolean()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L23:
            com.google.gson.ToNumberStrategy r0 = r3.toNumberStrategy
            java.lang.Number r4 = r0.readNumber(r4)
            return r4
        L2a:
            java.lang.String r4 = r4.nextString()
            return r4
        L2f:
            com.google.gson.internal.LinkedTreeMap r0 = new com.google.gson.internal.LinkedTreeMap
            r0.<init>()
            r4.beginObject()
        L37:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L49
            java.lang.String r1 = r4.nextName()
            java.lang.Object r2 = r3.read(r4)
            r0.put(r1, r2)
            goto L37
        L49:
            r4.endObject()
            return r0
        L4d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.beginArray()
        L55:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r3.read(r4)
            r0.add(r1)
            goto L55
        L63:
            r4.endArray()
            return r0
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter r3, java.lang.Object r4) throws java.io.IOException {
            r2 = this;
            if (r4 != 0) goto L6
            r3.nullValue()
            return
        L6:
            com.google.gson.Gson r0 = r2.gson
            java.lang.Class r1 = r4.getClass()
            com.google.gson.TypeAdapter r0 = r0.getAdapter(r1)
            boolean r1 = r0 instanceof com.google.gson.internal.bind.ObjectTypeAdapter
            if (r1 == 0) goto L1b
            r3.beginObject()
            r3.endObject()
            return
        L1b:
            r0.write(r3, r4)
            return
    }
}
