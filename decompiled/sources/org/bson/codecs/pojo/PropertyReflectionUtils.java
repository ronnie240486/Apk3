package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes2.dex */
final class PropertyReflectionUtils {
    private static final java.lang.String GET_PREFIX = "get";
    private static final java.lang.String IS_PREFIX = "is";
    private static final java.lang.String SET_PREFIX = "set";

    public static class PropertyMethods {
        private final java.util.Collection<java.lang.reflect.Method> getterMethods;
        private final java.util.Collection<java.lang.reflect.Method> setterMethods;

        public PropertyMethods(java.util.Collection<java.lang.reflect.Method> r1, java.util.Collection<java.lang.reflect.Method> r2) {
                r0 = this;
                r0.<init>()
                r0.getterMethods = r1
                r0.setterMethods = r2
                return
        }

        public final java.util.Collection<java.lang.reflect.Method> getGetterMethods() {
                r1 = this;
                java.util.Collection<java.lang.reflect.Method> r0 = r1.getterMethods
                return r0
        }

        public final java.util.Collection<java.lang.reflect.Method> getSetterMethods() {
                r1 = this;
                java.util.Collection<java.lang.reflect.Method> r0 = r1.setterMethods
                return r0
        }
    }

    private PropertyReflectionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isGetter(java.lang.reflect.Method r3) {
            java.lang.Class[] r0 = r3.getParameterTypes()
            int r0 = r0.length
            r1 = 0
            if (r0 <= 0) goto L9
            return r1
        L9:
            java.lang.String r0 = r3.getName()
            java.lang.String r2 = "get"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L2d
            java.lang.String r0 = r3.getName()
            int r0 = r0.length()
            r2 = 3
            if (r0 <= r2) goto L2d
            java.lang.String r3 = r3.getName()
            char r3 = r3.charAt(r2)
            boolean r3 = java.lang.Character.isUpperCase(r3)
            return r3
        L2d:
            java.lang.String r0 = r3.getName()
            java.lang.String r2 = "is"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L51
            java.lang.String r0 = r3.getName()
            int r0 = r0.length()
            r2 = 2
            if (r0 <= r2) goto L51
            java.lang.String r3 = r3.getName()
            char r3 = r3.charAt(r2)
            boolean r3 = java.lang.Character.isUpperCase(r3)
            return r3
        L51:
            return r1
    }

    public static java.lang.String toPropertyName(java.lang.reflect.Method r2) {
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "is"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto Le
            r0 = 2
            goto Lf
        Le:
            r0 = 3
        Lf:
            int r1 = r2.length()
            java.lang.String r2 = r2.substring(r0, r1)
            char[] r2 = r2.toCharArray()
            r0 = 0
            char r1 = r2[r0]
            char r1 = java.lang.Character.toLowerCase(r1)
            r2[r0] = r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
    }
}
