package org.bson.diagnostics;

/* JADX INFO: loaded from: classes2.dex */
class SLF4JLogger implements org.bson.diagnostics.Logger {
    private final org.slf4j.Logger delegate;

    public SLF4JLogger(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            org.slf4j.Logger r1 = org.slf4j.LoggerFactory.getLogger(r1)
            r0.delegate = r1
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void debug(java.lang.String r2) {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            r0.debug(r2)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void debug(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            r0.debug(r2, r3)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void error(java.lang.String r2) {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            r0.error(r2)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void error(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            r0.error(r2, r3)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public java.lang.String getName() {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.bson.diagnostics.Logger
    public void info(java.lang.String r2) {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            r0.info(r2)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void info(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            r0.info(r2, r3)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isDebugEnabled() {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            boolean r0 = r0.isDebugEnabled()
            return r0
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isErrorEnabled() {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            boolean r0 = r0.isErrorEnabled()
            return r0
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isInfoEnabled() {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            boolean r0 = r0.isInfoEnabled()
            return r0
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isTraceEnabled() {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            boolean r0 = r0.isTraceEnabled()
            return r0
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isWarnEnabled() {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            boolean r0 = r0.isWarnEnabled()
            return r0
    }

    @Override // org.bson.diagnostics.Logger
    public void trace(java.lang.String r2) {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            r0.trace(r2)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void trace(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            r0.trace(r2, r3)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void warn(java.lang.String r2) {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            r0.warn(r2)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void warn(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.Logger r0 = r1.delegate
            r0.warn(r2, r3)
            return
    }
}
