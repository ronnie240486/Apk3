package com.google.common.reflect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
abstract class TypeVisitor {
    private final java.util.Set<java.lang.reflect.Type> visited;

    public TypeVisitor() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = com.google.common.collect.Sets.newHashSet()
            r1.visited = r0
            return
    }

    public final void visit(java.lang.reflect.Type... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L73
            r2 = r5[r1]
            if (r2 == 0) goto L70
            java.util.Set<java.lang.reflect.Type> r3 = r4.visited
            boolean r3 = r3.add(r2)
            if (r3 != 0) goto L11
            goto L70
        L11:
            boolean r3 = r2 instanceof java.lang.reflect.TypeVariable     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L1c
            r3 = r2
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3     // Catch: java.lang.Throwable -> L69
            r4.visitTypeVariable(r3)     // Catch: java.lang.Throwable -> L69
            goto L70
        L1c:
            boolean r3 = r2 instanceof java.lang.reflect.WildcardType     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L27
            r3 = r2
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3     // Catch: java.lang.Throwable -> L69
            r4.visitWildcardType(r3)     // Catch: java.lang.Throwable -> L69
            goto L70
        L27:
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L32
            r3 = r2
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3     // Catch: java.lang.Throwable -> L69
            r4.visitParameterizedType(r3)     // Catch: java.lang.Throwable -> L69
            goto L70
        L32:
            boolean r3 = r2 instanceof java.lang.Class     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L3d
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L69
            r4.visitClass(r3)     // Catch: java.lang.Throwable -> L69
            goto L70
        L3d:
            boolean r3 = r2 instanceof java.lang.reflect.GenericArrayType     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L48
            r3 = r2
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3     // Catch: java.lang.Throwable -> L69
            r4.visitGenericArrayType(r3)     // Catch: java.lang.Throwable -> L69
            goto L70
        L48:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L69
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L69
            int r1 = r1 + 14
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "Unknown type: "
            r3.append(r1)     // Catch: java.lang.Throwable -> L69
            r3.append(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L69
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L69
            throw r5     // Catch: java.lang.Throwable -> L69
        L69:
            r5 = move-exception
            java.util.Set<java.lang.reflect.Type> r0 = r4.visited
            r0.remove(r2)
            throw r5
        L70:
            int r1 = r1 + 1
            goto L2
        L73:
            return
    }

    public void visitClass(java.lang.Class<?> r1) {
            r0 = this;
            return
    }

    public void visitGenericArrayType(java.lang.reflect.GenericArrayType r1) {
            r0 = this;
            return
    }

    public void visitParameterizedType(java.lang.reflect.ParameterizedType r1) {
            r0 = this;
            return
    }

    public void visitTypeVariable(java.lang.reflect.TypeVariable<?> r1) {
            r0 = this;
            return
    }

    public void visitWildcardType(java.lang.reflect.WildcardType r1) {
            r0 = this;
            return
    }
}
