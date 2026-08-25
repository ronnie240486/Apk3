package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class AlarmManagerCompat {

    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setExact(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
                r0.setExact(r1, r2, r4)
                return
        }
    }

    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.app.AlarmManager.AlarmClockInfo createAlarmClockInfo(long r1, android.app.PendingIntent r3) {
                android.app.AlarmManager$AlarmClockInfo r0 = new android.app.AlarmManager$AlarmClockInfo
                r0.<init>(r1, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setAlarmClock(android.app.AlarmManager r0, java.lang.Object r1, android.app.PendingIntent r2) {
                android.app.AlarmManager$AlarmClockInfo r1 = (android.app.AlarmManager.AlarmClockInfo) r1
                r0.setAlarmClock(r1, r2)
                return
        }
    }

    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
                r0.setAndAllowWhileIdle(r1, r2, r4)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setExactAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
                r0.setExactAndAllowWhileIdle(r1, r2, r4)
                return
        }
    }

    private AlarmManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static void setAlarmClock(@androidx.annotation.NonNull android.app.AlarmManager r0, long r1, @androidx.annotation.NonNull android.app.PendingIntent r3, @androidx.annotation.NonNull android.app.PendingIntent r4) {
            android.app.AlarmManager$AlarmClockInfo r1 = androidx.core.app.AlarmManagerCompat.Api21Impl.createAlarmClockInfo(r1, r3)
            androidx.core.app.AlarmManagerCompat.Api21Impl.setAlarmClock(r0, r1, r4)
            return
    }

    public static void setAndAllowWhileIdle(@androidx.annotation.NonNull android.app.AlarmManager r2, int r3, long r4, @androidx.annotation.NonNull android.app.PendingIntent r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            androidx.core.app.AlarmManagerCompat.Api23Impl.setAndAllowWhileIdle(r2, r3, r4, r6)
            goto Ld
        La:
            r2.set(r3, r4, r6)
        Ld:
            return
    }

    public static void setExact(@androidx.annotation.NonNull android.app.AlarmManager r0, int r1, long r2, @androidx.annotation.NonNull android.app.PendingIntent r4) {
            androidx.core.app.AlarmManagerCompat.Api19Impl.setExact(r0, r1, r2, r4)
            return
    }

    public static void setExactAndAllowWhileIdle(@androidx.annotation.NonNull android.app.AlarmManager r2, int r3, long r4, @androidx.annotation.NonNull android.app.PendingIntent r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            androidx.core.app.AlarmManagerCompat.Api23Impl.setExactAndAllowWhileIdle(r2, r3, r4, r6)
            goto Ld
        La:
            setExact(r2, r3, r4, r6)
        Ld:
            return
    }
}
