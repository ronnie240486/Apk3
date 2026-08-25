package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ViewGroupUtilsApi14 {
    private static final int LAYOUT_TRANSITION_CHANGING = 4;
    private static final java.lang.String TAG = "ViewGroupUtilsApi14";
    private static java.lang.reflect.Method sCancelMethod;
    private static boolean sCancelMethodFetched;
    private static android.animation.LayoutTransition sEmptyLayoutTransition;
    private static java.lang.reflect.Field sLayoutSuppressedField;
    private static boolean sLayoutSuppressedFieldFetched;

    /* JADX INFO: renamed from: androidx.transition.ViewGroupUtilsApi14$1, reason: invalid class name */
    final class AnonymousClass1 extends android.animation.LayoutTransition {
        public AnonymousClass1() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    private ViewGroupUtilsApi14() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void cancelLayoutTransition(android.animation.LayoutTransition r7) {
            boolean r0 = androidx.transition.ViewGroupUtilsApi14.sCancelMethodFetched
            java.lang.String r1 = "Failed to access cancel method by reflection"
            r2 = 0
            java.lang.String r3 = "ViewGroupUtilsApi14"
            if (r0 != 0) goto L1f
            r0 = 1
            java.lang.Class<android.animation.LayoutTransition> r4 = android.animation.LayoutTransition.class
            java.lang.String r5 = "cancel"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L1a
            androidx.transition.ViewGroupUtilsApi14.sCancelMethod = r4     // Catch: java.lang.NoSuchMethodException -> L1a
            r4.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L1a
            goto L1d
        L1a:
            android.util.Log.i(r3, r1)
        L1d:
            androidx.transition.ViewGroupUtilsApi14.sCancelMethodFetched = r0
        L1f:
            java.lang.reflect.Method r0 = androidx.transition.ViewGroupUtilsApi14.sCancelMethod
            if (r0 == 0) goto L32
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2f
            r0.invoke(r7, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2f
            goto L32
        L29:
            java.lang.String r7 = "Failed to invoke cancel method by reflection"
            android.util.Log.i(r3, r7)
            goto L32
        L2f:
            android.util.Log.i(r3, r1)
        L32:
            return
    }
}
