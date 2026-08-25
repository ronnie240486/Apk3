package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"LogConditional"})
public class Debug {
    public Debug() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void dumpLayoutParams(android.view.ViewGroup.LayoutParams r7, java.lang.String r8) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = ".("
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ") "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = "  "
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = " >>>>>>>>>>>>>>>>>>. dump "
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r2, r0, r8)
            java.lang.Class r2 = r7.getClass()
            java.lang.String r2 = r2.getName()
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r1.println(r8)
            java.lang.Class r8 = r7.getClass()
            java.lang.reflect.Field[] r8 = r8.getFields()
            r1 = 0
        L59:
            int r2 = r8.length
            if (r1 >= r2) goto La0
            r2 = r8[r1]
            java.lang.Object r3 = r2.get(r7)     // Catch: java.lang.IllegalAccessException -> L9d
            java.lang.String r2 = r2.getName()     // Catch: java.lang.IllegalAccessException -> L9d
            java.lang.String r4 = "To"
            boolean r4 = r2.contains(r4)     // Catch: java.lang.IllegalAccessException -> L9d
            if (r4 != 0) goto L6f
            goto L9d
        L6f:
            java.lang.String r4 = r3.toString()     // Catch: java.lang.IllegalAccessException -> L9d
            java.lang.String r5 = "-1"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.IllegalAccessException -> L9d
            if (r4 == 0) goto L7c
            goto L9d
        L7c:
            java.io.PrintStream r4 = java.lang.System.out     // Catch: java.lang.IllegalAccessException -> L9d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> L9d
            r5.<init>()     // Catch: java.lang.IllegalAccessException -> L9d
            r5.append(r0)     // Catch: java.lang.IllegalAccessException -> L9d
            java.lang.String r6 = "       "
            r5.append(r6)     // Catch: java.lang.IllegalAccessException -> L9d
            r5.append(r2)     // Catch: java.lang.IllegalAccessException -> L9d
            java.lang.String r2 = " "
            r5.append(r2)     // Catch: java.lang.IllegalAccessException -> L9d
            r5.append(r3)     // Catch: java.lang.IllegalAccessException -> L9d
            java.lang.String r2 = r5.toString()     // Catch: java.lang.IllegalAccessException -> L9d
            r4.println(r2)     // Catch: java.lang.IllegalAccessException -> L9d
        L9d:
            int r1 = r1 + 1
            goto L59
        La0:
            java.io.PrintStream r7 = java.lang.System.out
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = " <<<<<<<<<<<<<<<<< dump "
            r8.append(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.println(r8)
            return
    }

    public static void dumpLayoutParams(android.view.ViewGroup r10, java.lang.String r11) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = ".("
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ") "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = "  "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r1 = r10.getChildCount()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            java.lang.String r11 = " children "
            r3.append(r11)
            r3.append(r1)
            java.lang.String r11 = r3.toString()
            r2.println(r11)
            r11 = 0
        L54:
            if (r11 >= r1) goto Lcb
            android.view.View r2 = r10.getChildAt(r11)
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r4 = "     "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r4)
            java.lang.String r5 = getName(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.println(r4)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            java.lang.Class r3 = r2.getClass()
            java.lang.reflect.Field[] r3 = r3.getFields()
            r4 = 0
        L7d:
            int r5 = r3.length
            if (r4 >= r5) goto Lc8
            r5 = r3[r4]
            java.lang.Object r6 = r5.get(r2)     // Catch: java.lang.IllegalAccessException -> Lc5
            java.lang.String r7 = r5.getName()     // Catch: java.lang.IllegalAccessException -> Lc5
            java.lang.String r8 = "To"
            boolean r7 = r7.contains(r8)     // Catch: java.lang.IllegalAccessException -> Lc5
            if (r7 != 0) goto L93
            goto Lc5
        L93:
            java.lang.String r7 = r6.toString()     // Catch: java.lang.IllegalAccessException -> Lc5
            java.lang.String r8 = "-1"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.IllegalAccessException -> Lc5
            if (r7 == 0) goto La0
            goto Lc5
        La0:
            java.io.PrintStream r7 = java.lang.System.out     // Catch: java.lang.IllegalAccessException -> Lc5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> Lc5
            r8.<init>()     // Catch: java.lang.IllegalAccessException -> Lc5
            r8.append(r0)     // Catch: java.lang.IllegalAccessException -> Lc5
            java.lang.String r9 = "       "
            r8.append(r9)     // Catch: java.lang.IllegalAccessException -> Lc5
            java.lang.String r5 = r5.getName()     // Catch: java.lang.IllegalAccessException -> Lc5
            r8.append(r5)     // Catch: java.lang.IllegalAccessException -> Lc5
            java.lang.String r5 = " "
            r8.append(r5)     // Catch: java.lang.IllegalAccessException -> Lc5
            r8.append(r6)     // Catch: java.lang.IllegalAccessException -> Lc5
            java.lang.String r5 = r8.toString()     // Catch: java.lang.IllegalAccessException -> Lc5
            r7.println(r5)     // Catch: java.lang.IllegalAccessException -> Lc5
        Lc5:
            int r4 = r4 + 1
            goto L7d
        Lc8:
            int r11 = r11 + 1
            goto L54
        Lcb:
            return
    }

    public static void dumpPoc(java.lang.Object r11) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = ".("
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Class r1 = r11.getClass()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "------------- "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r3)
            java.lang.String r5 = r1.getName()
            r4.append(r5)
            java.lang.String r5 = " --------------------"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.println(r4)
            java.lang.reflect.Field[] r2 = r1.getFields()
            r4 = 0
        L52:
            int r6 = r2.length
            if (r4 >= r6) goto Ld5
            r6 = r2[r4]
            java.lang.Object r7 = r6.get(r11)     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r8 = r6.getName()     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r9 = "layout_constraint"
            boolean r8 = r8.startsWith(r9)     // Catch: java.lang.IllegalAccessException -> Ld1
            if (r8 != 0) goto L68
            goto Ld1
        L68:
            boolean r8 = r7 instanceof java.lang.Integer     // Catch: java.lang.IllegalAccessException -> Ld1
            if (r8 == 0) goto L79
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r9 = "-1"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Ld1
            if (r8 == 0) goto L79
            goto Ld1
        L79:
            boolean r8 = r7 instanceof java.lang.Integer     // Catch: java.lang.IllegalAccessException -> Ld1
            if (r8 == 0) goto L8a
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r9 = "0"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Ld1
            if (r8 == 0) goto L8a
            goto Ld1
        L8a:
            boolean r8 = r7 instanceof java.lang.Float     // Catch: java.lang.IllegalAccessException -> Ld1
            if (r8 == 0) goto L9b
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r9 = "1.0"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Ld1
            if (r8 == 0) goto L9b
            goto Ld1
        L9b:
            boolean r8 = r7 instanceof java.lang.Float     // Catch: java.lang.IllegalAccessException -> Ld1
            if (r8 == 0) goto Lac
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r9 = "0.5"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Ld1
            if (r8 == 0) goto Lac
            goto Ld1
        Lac:
            java.io.PrintStream r8 = java.lang.System.out     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> Ld1
            r9.<init>()     // Catch: java.lang.IllegalAccessException -> Ld1
            r9.append(r0)     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r10 = "    "
            r9.append(r10)     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r6 = r6.getName()     // Catch: java.lang.IllegalAccessException -> Ld1
            r9.append(r6)     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r6 = " "
            r9.append(r6)     // Catch: java.lang.IllegalAccessException -> Ld1
            r9.append(r7)     // Catch: java.lang.IllegalAccessException -> Ld1
            java.lang.String r6 = r9.toString()     // Catch: java.lang.IllegalAccessException -> Ld1
            r8.println(r6)     // Catch: java.lang.IllegalAccessException -> Ld1
        Ld1:
            int r4 = r4 + 1
            goto L52
        Ld5:
            java.io.PrintStream r11 = java.lang.System.out
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r3)
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r11.println(r0)
            return
    }

    public static java.lang.String getActionType(android.view.MotionEvent r5) {
            int r5 = r5.getAction()
            java.lang.Class<android.view.MotionEvent> r0 = android.view.MotionEvent.class
            java.lang.reflect.Field[] r0 = r0.getFields()
            r1 = 0
        Lb:
            int r2 = r0.length
            if (r1 >= r2) goto L35
            r2 = r0[r1]
            int r3 = r2.getModifiers()     // Catch: java.lang.IllegalAccessException -> L32
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.IllegalAccessException -> L32
            if (r3 == 0) goto L32
            java.lang.Class r3 = r2.getType()     // Catch: java.lang.IllegalAccessException -> L32
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.IllegalAccessException -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.IllegalAccessException -> L32
            if (r3 == 0) goto L32
            r3 = 0
            int r3 = r2.getInt(r3)     // Catch: java.lang.IllegalAccessException -> L32
            if (r3 != r5) goto L32
            java.lang.String r5 = r2.getName()     // Catch: java.lang.IllegalAccessException -> L32
            return r5
        L32:
            int r1 = r1 + 1
            goto Lb
        L35:
            java.lang.String r5 = "---"
            return r5
    }

    public static java.lang.String getCallFrom(int r2) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r2 = r2 + 2
            r2 = r0[r2]
            java.lang.String r0 = ".("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.getFileName()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            int r2 = r2.getLineNumber()
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String getLoc() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = ".("
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r2 = r0.getLineNumber()
            r1.append(r2)
            java.lang.String r2 = ") "
            r1.append(r2)
            java.lang.String r0 = r0.getMethodName()
            r1.append(r0)
            java.lang.String r0 = "()"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static java.lang.String getLocation() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = ".("
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static java.lang.String getLocation2() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 2
            r0 = r0[r1]
            java.lang.String r1 = ".("
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r0 = r0.getLineNumber()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static java.lang.String getName(android.content.Context r1, int r2) {
            r0 = -1
            if (r2 == r0) goto Lc
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> Lf
            java.lang.String r1 = r1.getResourceEntryName(r2)     // Catch: java.lang.Exception -> Lf
            return r1
        Lc:
            java.lang.String r1 = "UNKNOWN"
            return r1
        Lf:
            java.lang.String r1 = "?"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
            return r1
    }

    public static java.lang.String getName(android.content.Context r5, int[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r0.<init>()     // Catch: java.lang.Exception -> L72
            int r1 = r6.length     // Catch: java.lang.Exception -> L72
            r0.append(r1)     // Catch: java.lang.Exception -> L72
            java.lang.String r1 = "["
            r0.append(r1)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L72
            r1 = 0
        L13:
            int r2 = r6.length     // Catch: java.lang.Exception -> L72
            if (r1 >= r2) goto L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r2.<init>()     // Catch: java.lang.Exception -> L72
            r2.append(r0)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = " "
            if (r1 != 0) goto L25
            java.lang.String r3 = ""
            goto L26
        L25:
            r3 = r0
        L26:
            r2.append(r3)     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L72
            android.content.res.Resources r3 = r5.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Exception -> L72
            r4 = r6[r1]     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Exception -> L72
            java.lang.String r0 = r3.getResourceEntryName(r4)     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Exception -> L72
            goto L4e
        L38:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r3.<init>()     // Catch: java.lang.Exception -> L72
            java.lang.String r4 = "? "
            r3.append(r4)     // Catch: java.lang.Exception -> L72
            r4 = r6[r1]     // Catch: java.lang.Exception -> L72
            r3.append(r4)     // Catch: java.lang.Exception -> L72
            r3.append(r0)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L72
        L4e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r3.<init>()     // Catch: java.lang.Exception -> L72
            r3.append(r2)     // Catch: java.lang.Exception -> L72
            r3.append(r0)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L72
            int r1 = r1 + 1
            goto L13
        L60:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r5.<init>()     // Catch: java.lang.Exception -> L72
            r5.append(r0)     // Catch: java.lang.Exception -> L72
            java.lang.String r6 = "]"
            r5.append(r6)     // Catch: java.lang.Exception -> L72
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L72
            return r5
        L72:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "DEBUG"
            android.util.Log.v(r6, r5)
            java.lang.String r5 = "UNKNOWN"
            return r5
    }

    public static java.lang.String getName(android.view.View r1) {
            android.content.Context r0 = r1.getContext()     // Catch: java.lang.Exception -> L11
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L11
            int r1 = r1.getId()     // Catch: java.lang.Exception -> L11
            java.lang.String r1 = r0.getResourceEntryName(r1)     // Catch: java.lang.Exception -> L11
            return r1
        L11:
            java.lang.String r1 = "UNKNOWN"
            return r1
    }

    public static java.lang.String getState(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2) {
            r0 = -1
            java.lang.String r1 = getState(r1, r2, r0)
            return r1
    }

    public static java.lang.String getState(androidx.constraintlayout.motion.widget.MotionLayout r2, int r3, int r4) {
            r0 = -1
            if (r3 != r0) goto L6
            java.lang.String r2 = "UNDEFINED"
            return r2
        L6:
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getResourceEntryName(r3)
            if (r4 == r0) goto L60
            int r3 = r2.length()
            if (r3 <= r4) goto L22
            java.lang.String r3 = "([^_])[aeiou]+"
            java.lang.String r0 = "$1"
            java.lang.String r2 = r2.replaceAll(r3, r0)
        L22:
            int r3 = r2.length()
            if (r3 <= r4) goto L60
            java.lang.String r3 = "[^_]"
            java.lang.String r0 = ""
            java.lang.String r3 = r2.replaceAll(r3, r0)
            int r3 = r3.length()
            if (r3 <= 0) goto L60
            int r0 = r2.length()
            int r0 = r0 - r4
            int r0 = r0 / r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.nio.CharBuffer r4 = java.nio.CharBuffer.allocate(r0)
            java.lang.String r4 = r4.toString()
            r0 = 0
            r1 = 46
            java.lang.String r4 = r4.replace(r0, r1)
            r3.append(r4)
            java.lang.String r4 = "_"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = r2.replaceAll(r3, r4)
        L60:
            return r2
    }

    public static void logStack(java.lang.String r6, java.lang.String r7, int r8) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            int r8 = java.lang.Math.min(r8, r1)
            java.lang.String r1 = " "
            r3 = r1
        L13:
            if (r2 > r8) goto L65
            r4 = r0[r2]
            java.lang.String r4 = ".("
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            r5 = r0[r2]
            java.lang.String r5 = r5.getFileName()
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            r5 = r0[r2]
            int r5 = r5.getLineNumber()
            r4.append(r5)
            java.lang.String r5 = ") "
            r4.append(r5)
            r5 = r0[r2]
            java.lang.String r5 = r5.getMethodName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r3)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r4 = r5.toString()
            android.util.Log.v(r6, r4)
            int r2 = r2 + 1
            goto L13
        L65:
            return
    }

    public static void printStack(java.lang.String r7, int r8) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            int r8 = java.lang.Math.min(r8, r1)
            java.lang.String r1 = " "
            r3 = r1
        L13:
            if (r2 > r8) goto L5e
            r4 = r0[r2]
            java.lang.String r4 = ".("
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            r5 = r0[r2]
            java.lang.String r5 = r5.getFileName()
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            r5 = r0[r2]
            int r5 = r5.getLineNumber()
            r4.append(r5)
            java.lang.String r5 = ") "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1)
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r3)
            r6.append(r4)
            r6.append(r3)
            java.lang.String r4 = r6.toString()
            r5.println(r4)
            int r2 = r2 + 1
            goto L13
        L5e:
            return
    }
}
