package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends java.lang.Exception {
    private static final java.lang.StackTraceElement[] EMPTY_ELEMENTS = null;
    private static final long serialVersionUID = 1;
    private final java.util.List<java.lang.Throwable> causes;
    private java.lang.Class<?> dataClass;
    private com.bumptech.glide.load.DataSource dataSource;
    private java.lang.String detailMessage;

    @androidx.annotation.Nullable
    private java.lang.Exception exception;
    private com.bumptech.glide.load.Key key;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class IndentedAppendable implements java.lang.Appendable {
        private static final java.lang.String EMPTY_SEQUENCE = "";
        private static final java.lang.String INDENT = "  ";
        private final java.lang.Appendable appendable;
        private boolean printedNewLine;

        public IndentedAppendable(java.lang.Appendable r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.printedNewLine = r0
                r1.appendable = r2
                return
        }

        @androidx.annotation.NonNull
        private java.lang.CharSequence safeSequence(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                if (r1 != 0) goto L4
                java.lang.String r1 = ""
            L4:
                return r1
        }

        @Override // java.lang.Appendable
        public java.lang.Appendable append(char r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.printedNewLine
                r1 = 0
                if (r0 == 0) goto Le
                r3.printedNewLine = r1
                java.lang.Appendable r0 = r3.appendable
                java.lang.String r2 = "  "
                r0.append(r2)
            Le:
                r0 = 10
                if (r4 != r0) goto L13
                r1 = 1
            L13:
                r3.printedNewLine = r1
                java.lang.Appendable r0 = r3.appendable
                r0.append(r4)
                return r3
        }

        @Override // java.lang.Appendable
        public java.lang.Appendable append(@androidx.annotation.Nullable java.lang.CharSequence r3) throws java.io.IOException {
                r2 = this;
                java.lang.CharSequence r3 = r2.safeSequence(r3)
                int r0 = r3.length()
                r1 = 0
                java.lang.Appendable r3 = r2.append(r3, r1, r0)
                return r3
        }

        @Override // java.lang.Appendable
        public java.lang.Appendable append(@androidx.annotation.Nullable java.lang.CharSequence r4, int r5, int r6) throws java.io.IOException {
                r3 = this;
                java.lang.CharSequence r4 = r3.safeSequence(r4)
                boolean r0 = r3.printedNewLine
                r1 = 0
                if (r0 == 0) goto L12
                r3.printedNewLine = r1
                java.lang.Appendable r0 = r3.appendable
                java.lang.String r2 = "  "
                r0.append(r2)
            L12:
                int r0 = r4.length()
                if (r0 <= 0) goto L23
                int r0 = r6 + (-1)
                char r0 = r4.charAt(r0)
                r2 = 10
                if (r0 != r2) goto L23
                r1 = 1
            L23:
                r3.printedNewLine = r1
                java.lang.Appendable r0 = r3.appendable
                r0.append(r4, r5, r6)
                return r3
        }
    }

    static {
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            com.bumptech.glide.load.engine.GlideException.EMPTY_ELEMENTS = r0
            return
    }

    public GlideException(java.lang.String r2) {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            r1.<init>(r2, r0)
            return
    }

    public GlideException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r0.<init>(r1, r2)
            return
    }

    public GlideException(java.lang.String r1, java.util.List<java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>()
            r0.detailMessage = r1
            java.lang.StackTraceElement[] r1 = com.bumptech.glide.load.engine.GlideException.EMPTY_ELEMENTS
            r0.setStackTrace(r1)
            r0.causes = r2
            return
    }

    private void addRootCauses(java.lang.Throwable r2, java.util.List<java.lang.Throwable> r3) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.engine.GlideException
            if (r0 == 0) goto L1e
            com.bumptech.glide.load.engine.GlideException r2 = (com.bumptech.glide.load.engine.GlideException) r2
            java.util.List r2 = r2.getCauses()
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r2.next()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.addRootCauses(r0, r3)
            goto Le
        L1e:
            r3.add(r2)
        L21:
            return
    }

    private static void appendCauses(java.util.List<java.lang.Throwable> r0, java.lang.Appendable r1) {
            appendCausesWrapped(r0, r1)     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static void appendCausesWrapped(java.util.List<java.lang.Throwable> r5, java.lang.Appendable r6) throws java.io.IOException {
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L3f
            java.lang.String r2 = "Cause ("
            java.lang.Appendable r2 = r6.append(r2)
            int r3 = r1 + 1
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.Appendable r2 = r2.append(r4)
            java.lang.String r4 = " of "
            java.lang.Appendable r2 = r2.append(r4)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.Appendable r2 = r2.append(r4)
            java.lang.String r4 = "): "
            r2.append(r4)
            java.lang.Object r1 = r5.get(r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r2 = r1 instanceof com.bumptech.glide.load.engine.GlideException
            if (r2 == 0) goto L3a
            com.bumptech.glide.load.engine.GlideException r1 = (com.bumptech.glide.load.engine.GlideException) r1
            r1.printStackTrace(r6)
            goto L3d
        L3a:
            appendExceptionMessage(r1, r6)
        L3d:
            r1 = r3
            goto L5
        L3f:
            return
    }

    private static void appendExceptionMessage(java.lang.Throwable r1, java.lang.Appendable r2) {
            java.lang.Class r0 = r1.getClass()     // Catch: java.io.IOException -> L20
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L20
            java.lang.Appendable r2 = r2.append(r0)     // Catch: java.io.IOException -> L20
            java.lang.String r0 = ": "
            java.lang.Appendable r2 = r2.append(r0)     // Catch: java.io.IOException -> L20
            java.lang.String r0 = r1.getMessage()     // Catch: java.io.IOException -> L20
            java.lang.Appendable r2 = r2.append(r0)     // Catch: java.io.IOException -> L20
            r0 = 10
            r2.append(r0)     // Catch: java.io.IOException -> L20
            return
        L20:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    private void printStackTrace(java.lang.Appendable r3) {
            r2 = this;
            appendExceptionMessage(r2, r3)
            java.util.List r0 = r2.getCauses()
            com.bumptech.glide.load.engine.GlideException$IndentedAppendable r1 = new com.bumptech.glide.load.engine.GlideException$IndentedAppendable
            r1.<init>(r3)
            appendCauses(r0, r1)
            return
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
            r0 = this;
            return r0
    }

    public java.util.List<java.lang.Throwable> getCauses() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.causes
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 71
            r0.<init>(r1)
            java.lang.String r1 = r5.detailMessage
            r0.append(r1)
            java.lang.Class<?> r1 = r5.dataClass
            java.lang.String r2 = ", "
            java.lang.String r3 = ""
            if (r1 == 0) goto L22
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.Class<?> r4 = r5.dataClass
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L23
        L22:
            r1 = r3
        L23:
            r0.append(r1)
            com.bumptech.glide.load.DataSource r1 = r5.dataSource
            if (r1 == 0) goto L38
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            com.bumptech.glide.load.DataSource r4 = r5.dataSource
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L39
        L38:
            r1 = r3
        L39:
            r0.append(r1)
            com.bumptech.glide.load.Key r1 = r5.key
            if (r1 == 0) goto L4d
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            com.bumptech.glide.load.Key r2 = r5.key
            r1.append(r2)
            java.lang.String r3 = r1.toString()
        L4d:
            r0.append(r3)
            java.util.List r1 = r5.getRootCauses()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L5f
            java.lang.String r0 = r0.toString()
            return r0
        L5f:
            int r2 = r1.size()
            r3 = 1
            if (r2 != r3) goto L6c
            java.lang.String r2 = "\nThere was 1 root cause:"
            r0.append(r2)
            goto L7d
        L6c:
            java.lang.String r2 = "\nThere were "
            r0.append(r2)
            int r2 = r1.size()
            r0.append(r2)
            java.lang.String r2 = " root causes:"
            r0.append(r2)
        L7d:
            java.util.Iterator r1 = r1.iterator()
        L81:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r1.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3 = 10
            r0.append(r3)
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            r3 = 40
            r0.append(r3)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            goto L81
        Laf:
            java.lang.String r1 = "\n call GlideException#logRootCauses(String) for more detail"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Exception getOrigin() {
            r1 = this;
            java.lang.Exception r0 = r1.exception
            return r0
    }

    public java.util.List<java.lang.Throwable> getRootCauses() {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.addRootCauses(r1, r0)
            return r0
    }

    public void logRootCauses(java.lang.String r7) {
            r6 = this;
            java.util.List r0 = r6.getRootCauses()
            int r1 = r0.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L32
            java.lang.String r3 = "Root cause ("
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r4 = r2 + 1
            r3.append(r4)
            java.lang.String r5 = " of "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = ")"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            android.util.Log.i(r7, r3, r2)
            r2 = r4
            goto L9
        L32:
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
            r1 = this;
            java.io.PrintStream r0 = java.lang.System.err
            r1.printStackTrace(r0)
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintStream r1) {
            r0 = this;
            r0.printStackTrace(r1)
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintWriter r1) {
            r0 = this;
            r0.printStackTrace(r1)
            return
    }

    public final void setLoggingDetails(com.bumptech.glide.load.Key r1, com.bumptech.glide.load.DataSource r2) {
            r0 = this;
            r0.key = r1
            r0.dataSource = r2
            r1 = 0
            r0.dataClass = r1
            return
    }

    public final void setLoggingDetails(com.bumptech.glide.load.Key r1, com.bumptech.glide.load.DataSource r2, java.lang.Class<?> r3) {
            r0 = this;
            r0.key = r1
            r0.dataSource = r2
            r0.dataClass = r3
            return
    }

    public void setOrigin(@androidx.annotation.Nullable java.lang.Exception r1) {
            r0 = this;
            r0.exception = r1
            return
    }
}
