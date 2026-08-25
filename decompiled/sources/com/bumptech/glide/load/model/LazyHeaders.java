package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyHeaders implements com.bumptech.glide.load.model.Headers {
    private volatile java.util.Map<java.lang.String, java.lang.String> combinedHeaders;
    private final java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> headers;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        private static final java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> DEFAULT_HEADERS = null;
        private static final java.lang.String DEFAULT_USER_AGENT = null;
        private static final java.lang.String USER_AGENT_HEADER = "User-Agent";
        private boolean copyOnModify;
        private java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> headers;
        private boolean isUserAgentDefault;

        static {
                java.lang.String r0 = "http.agent"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto Ld
                goto L3d
            Ld:
                int r1 = r0.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r3 = r0.length()
                r2.<init>(r3)
                r3 = 0
            L1b:
                if (r3 >= r1) goto L39
                char r4 = r0.charAt(r3)
                r5 = 31
                if (r4 > r5) goto L29
                r5 = 9
                if (r4 != r5) goto L31
            L29:
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L31
                r2.append(r4)
                goto L36
            L31:
                r4 = 63
                r2.append(r4)
            L36:
                int r3 = r3 + 1
                goto L1b
            L39:
                java.lang.String r0 = r2.toString()
            L3d:
                com.bumptech.glide.load.model.LazyHeaders.Builder.DEFAULT_USER_AGENT = r0
                java.util.HashMap r1 = new java.util.HashMap
                r2 = 2
                r1.<init>(r2)
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto L59
                com.bumptech.glide.load.model.LazyHeaders$StringHeaderFactory r2 = new com.bumptech.glide.load.model.LazyHeaders$StringHeaderFactory
                r2.<init>(r0)
                java.util.List r0 = java.util.Collections.singletonList(r2)
                java.lang.String r2 = "User-Agent"
                r1.put(r2, r0)
            L59:
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
                com.bumptech.glide.load.model.LazyHeaders.Builder.DEFAULT_HEADERS = r0
                return
        }

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.copyOnModify = r0
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r1 = com.bumptech.glide.load.model.LazyHeaders.Builder.DEFAULT_HEADERS
                r2.headers = r1
                r2.isUserAgentDefault = r0
                return
        }

        private java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> copyHeaders() {
                r5 = this;
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r1 = r5.headers
                int r1 = r1.size()
                r0.<init>(r1)
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r1 = r5.headers
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L15:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L34
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.util.ArrayList r3 = new java.util.ArrayList
                java.lang.Object r4 = r2.getValue()
                java.util.Collection r4 = (java.util.Collection) r4
                r3.<init>(r4)
                java.lang.Object r2 = r2.getKey()
                r0.put(r2, r3)
                goto L15
            L34:
                return r0
        }

        private void copyIfNecessary() {
                r1 = this;
                boolean r0 = r1.copyOnModify
                if (r0 == 0) goto Ld
                r0 = 0
                r1.copyOnModify = r0
                java.util.Map r0 = r1.copyHeaders()
                r1.headers = r0
            Ld:
                return
        }

        private java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory> getFactories(java.lang.String r3) {
                r2 = this;
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r0 = r2.headers
                java.lang.Object r0 = r0.get(r3)
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L14
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r1 = r2.headers
                r1.put(r3, r0)
            L14:
                return r0
        }

        public com.bumptech.glide.load.model.LazyHeaders.Builder addHeader(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull com.bumptech.glide.load.model.LazyHeaderFactory r3) {
                r1 = this;
                boolean r0 = r1.isUserAgentDefault
                if (r0 == 0) goto L11
                java.lang.String r0 = "User-Agent"
                boolean r0 = r0.equalsIgnoreCase(r2)
                if (r0 == 0) goto L11
                com.bumptech.glide.load.model.LazyHeaders$Builder r2 = r1.setHeader(r2, r3)
                return r2
            L11:
                r1.copyIfNecessary()
                java.util.List r2 = r1.getFactories(r2)
                r2.add(r3)
                return r1
        }

        public com.bumptech.glide.load.model.LazyHeaders.Builder addHeader(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
                r1 = this;
                com.bumptech.glide.load.model.LazyHeaders$StringHeaderFactory r0 = new com.bumptech.glide.load.model.LazyHeaders$StringHeaderFactory
                r0.<init>(r3)
                com.bumptech.glide.load.model.LazyHeaders$Builder r2 = r1.addHeader(r2, r0)
                return r2
        }

        public com.bumptech.glide.load.model.LazyHeaders build() {
                r2 = this;
                r0 = 1
                r2.copyOnModify = r0
                com.bumptech.glide.load.model.LazyHeaders r0 = new com.bumptech.glide.load.model.LazyHeaders
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r1 = r2.headers
                r0.<init>(r1)
                return r0
        }

        public com.bumptech.glide.load.model.LazyHeaders.Builder setHeader(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable com.bumptech.glide.load.model.LazyHeaderFactory r3) {
                r1 = this;
                r1.copyIfNecessary()
                if (r3 != 0) goto Lb
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r3 = r1.headers
                r3.remove(r2)
                goto L15
            Lb:
                java.util.List r0 = r1.getFactories(r2)
                r0.clear()
                r0.add(r3)
            L15:
                boolean r3 = r1.isUserAgentDefault
                if (r3 == 0) goto L24
                java.lang.String r3 = "User-Agent"
                boolean r2 = r3.equalsIgnoreCase(r2)
                if (r2 == 0) goto L24
                r2 = 0
                r1.isUserAgentDefault = r2
            L24:
                return r1
        }

        public com.bumptech.glide.load.model.LazyHeaders.Builder setHeader(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3) {
                r1 = this;
                if (r3 != 0) goto L4
                r3 = 0
                goto La
            L4:
                com.bumptech.glide.load.model.LazyHeaders$StringHeaderFactory r0 = new com.bumptech.glide.load.model.LazyHeaders$StringHeaderFactory
                r0.<init>(r3)
                r3 = r0
            La:
                com.bumptech.glide.load.model.LazyHeaders$Builder r2 = r1.setHeader(r2, r3)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class StringHeaderFactory implements com.bumptech.glide.load.model.LazyHeaderFactory {

        @androidx.annotation.NonNull
        private final java.lang.String value;

        public StringHeaderFactory(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // com.bumptech.glide.load.model.LazyHeaderFactory
        public java.lang.String buildHeader() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.bumptech.glide.load.model.LazyHeaders.StringHeaderFactory
                if (r0 == 0) goto Lf
                com.bumptech.glide.load.model.LazyHeaders$StringHeaderFactory r2 = (com.bumptech.glide.load.model.LazyHeaders.StringHeaderFactory) r2
                java.lang.String r0 = r1.value
                java.lang.String r2 = r2.value
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.value
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "StringHeaderFactory{value='"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r1 = r2.value
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public LazyHeaders(java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.headers = r1
            return
    }

    @androidx.annotation.NonNull
    private java.lang.String buildHeaderValue(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory> r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L2f
            java.lang.Object r3 = r6.get(r2)
            com.bumptech.glide.load.model.LazyHeaderFactory r3 = (com.bumptech.glide.load.model.LazyHeaderFactory) r3
            java.lang.String r3 = r3.buildHeader()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L2c
            r0.append(r3)
            int r3 = r6.size()
            int r3 = r3 + (-1)
            if (r2 == r3) goto L2c
            r3 = 44
            r0.append(r3)
        L2c:
            int r2 = r2 + 1
            goto La
        L2f:
            java.lang.String r6 = r0.toString()
            return r6
    }

    private java.util.Map<java.lang.String, java.lang.String> generateHeaders() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r1 = r5.headers
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.String r3 = r5.buildHeaderValue(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto Lf
            java.lang.Object r2 = r2.getKey()
            r0.put(r2, r3)
            goto Lf
        L33:
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.model.LazyHeaders
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.model.LazyHeaders r2 = (com.bumptech.glide.load.model.LazyHeaders) r2
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r0 = r1.headers
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r2 = r2.headers
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.model.Headers
    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.combinedHeaders
            if (r0 != 0) goto L18
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.combinedHeaders     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L13
            java.util.Map r0 = r1.generateHeaders()     // Catch: java.lang.Throwable -> L15
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch: java.lang.Throwable -> L15
            r1.combinedHeaders = r0     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r0
        L18:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.combinedHeaders
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r0 = r1.headers
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "LazyHeaders{headers="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> r1 = r2.headers
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
