package org.bson.diagnostics;

/* JADX INFO: loaded from: classes3.dex */
public interface Logger {
    void debug(java.lang.String r1);

    void debug(java.lang.String r1, java.lang.Throwable r2);

    void error(java.lang.String r1);

    void error(java.lang.String r1, java.lang.Throwable r2);

    java.lang.String getName();

    void info(java.lang.String r1);

    void info(java.lang.String r1, java.lang.Throwable r2);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    void trace(java.lang.String r1);

    void trace(java.lang.String r1, java.lang.Throwable r2);

    void warn(java.lang.String r1);

    void warn(java.lang.String r1, java.lang.Throwable r2);
}
