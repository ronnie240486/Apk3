package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
class TimeSource {
    private static final com.google.android.material.datepicker.TimeSource SYSTEM_TIME_SOURCE = null;

    @androidx.annotation.Nullable
    private final java.lang.Long fixedTimeMs;

    @androidx.annotation.Nullable
    private final java.util.TimeZone fixedTimeZone;

    static {
            com.google.android.material.datepicker.TimeSource r0 = new com.google.android.material.datepicker.TimeSource
            r1 = 0
            r0.<init>(r1, r1)
            com.google.android.material.datepicker.TimeSource.SYSTEM_TIME_SOURCE = r0
            return
    }

    private TimeSource(@androidx.annotation.Nullable java.lang.Long r1, @androidx.annotation.Nullable java.util.TimeZone r2) {
            r0 = this;
            r0.<init>()
            r0.fixedTimeMs = r1
            r0.fixedTimeZone = r2
            return
    }

    public static com.google.android.material.datepicker.TimeSource system() {
            com.google.android.material.datepicker.TimeSource r0 = com.google.android.material.datepicker.TimeSource.SYSTEM_TIME_SOURCE
            return r0
    }

    public final java.util.Calendar now() {
            r3 = this;
            java.util.TimeZone r0 = r3.fixedTimeZone
            if (r0 != 0) goto L9
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            goto Ld
        L9:
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
        Ld:
            java.lang.Long r1 = r3.fixedTimeMs
            if (r1 == 0) goto L18
            long r1 = r1.longValue()
            r0.setTimeInMillis(r1)
        L18:
            return r0
    }
}
