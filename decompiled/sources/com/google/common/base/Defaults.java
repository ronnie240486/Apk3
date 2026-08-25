package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Defaults {
    private static final java.lang.Double DOUBLE_DEFAULT = null;
    private static final java.lang.Float FLOAT_DEFAULT = null;

    static {
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            com.google.common.base.Defaults.DOUBLE_DEFAULT = r0
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.google.common.base.Defaults.FLOAT_DEFAULT = r0
            return
    }

    private Defaults() {
            r0 = this;
            r0.<init>()
            return
    }

    @javax.annotation.CheckForNull
    public static <T> T defaultValue(java.lang.Class<T> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L4e
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r2 != r0) goto L10
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        L10:
            java.lang.Class r0 = java.lang.Character.TYPE
            r1 = 0
            if (r2 != r0) goto L1a
            java.lang.Character r2 = java.lang.Character.valueOf(r1)
            return r2
        L1a:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r2 != r0) goto L23
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            return r2
        L23:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r2 != r0) goto L2c
            java.lang.Short r2 = java.lang.Short.valueOf(r1)
            return r2
        L2c:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto L35
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            return r2
        L35:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r2 != r0) goto L40
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L40:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r2 != r0) goto L47
            java.lang.Float r2 = com.google.common.base.Defaults.FLOAT_DEFAULT
            return r2
        L47:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r2 != r0) goto L4e
            java.lang.Double r2 = com.google.common.base.Defaults.DOUBLE_DEFAULT
            return r2
        L4e:
            r2 = 0
            return r2
    }
}
