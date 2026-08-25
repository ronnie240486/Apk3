package com.google.common.base;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Objects extends com.google.common.base.ExtraObjectsMethodsForWeb {
    private Objects() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean equal(@javax.annotation.CheckForNull java.lang.Object r0, @javax.annotation.CheckForNull java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public static int hashCode(@javax.annotation.CheckForNull java.lang.Object... r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
