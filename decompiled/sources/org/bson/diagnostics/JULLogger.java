package org.bson.diagnostics;

/* JADX INFO: loaded from: classes3.dex */
class JULLogger implements org.bson.diagnostics.Logger {
    private final java.util.logging.Logger delegate;

    public JULLogger(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            r0.delegate = r1
            return
    }

    private boolean isEnabled(java.util.logging.Level r2) {
            r1 = this;
            java.util.logging.Logger r0 = r1.delegate
            boolean r2 = r0.isLoggable(r2)
            return r2
    }

    private void log(java.util.logging.Level r2, java.lang.String r3) {
            r1 = this;
            java.util.logging.Logger r0 = r1.delegate
            r0.log(r2, r3)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void debug(java.lang.String r2) {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            r1.log(r0, r2)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void debug(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            r1.log(r0, r2, r3)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void error(java.lang.String r2) {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.SEVERE
            r1.log(r0, r2)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void error(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.SEVERE
            r1.log(r0, r2, r3)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public java.lang.String getName() {
            r1 = this;
            java.util.logging.Logger r0 = r1.delegate
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.bson.diagnostics.Logger
    public void info(java.lang.String r2) {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            r1.log(r0, r2)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void info(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            r1.log(r0, r2, r3)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isDebugEnabled() {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            boolean r0 = r1.isEnabled(r0)
            return r0
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isErrorEnabled() {
            r2 = this;
            java.util.logging.Logger r0 = r2.delegate
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            boolean r0 = r0.isLoggable(r1)
            return r0
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isInfoEnabled() {
            r2 = this;
            java.util.logging.Logger r0 = r2.delegate
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            boolean r0 = r0.isLoggable(r1)
            return r0
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isTraceEnabled() {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.FINER
            boolean r0 = r1.isEnabled(r0)
            return r0
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isWarnEnabled() {
            r2 = this;
            java.util.logging.Logger r0 = r2.delegate
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            boolean r0 = r0.isLoggable(r1)
            return r0
    }

    public void log(java.util.logging.Level r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            java.util.logging.Logger r0 = r1.delegate
            r0.log(r2, r3, r4)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void trace(java.lang.String r2) {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.FINER
            r1.log(r0, r2)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void trace(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.FINER
            r1.log(r0, r2, r3)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void warn(java.lang.String r2) {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            r1.log(r0, r2)
            return
    }

    @Override // org.bson.diagnostics.Logger
    public void warn(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            r1.log(r0, r2, r3)
            return
    }
}
