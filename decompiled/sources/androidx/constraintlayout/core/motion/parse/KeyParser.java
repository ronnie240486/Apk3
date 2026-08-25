package androidx.constraintlayout.core.motion.parse;

/* JADX INFO: loaded from: classes2.dex */
public class KeyParser {

    public interface DataType {
        int get(int r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface Ids {
        int get(java.lang.String r1);
    }

    public KeyParser() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void main(java.lang.String[] r0) {
            java.lang.String r0 = "{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}"
            parseAttributes(r0)
            return
    }

    private static androidx.constraintlayout.core.motion.utils.TypedBundle parse(java.lang.String r9, androidx.constraintlayout.core.motion.parse.KeyParser.Ids r10, androidx.constraintlayout.core.motion.parse.KeyParser.DataType r11) {
            androidx.constraintlayout.core.motion.utils.TypedBundle r0 = new androidx.constraintlayout.core.motion.utils.TypedBundle
            r0.<init>()
            androidx.constraintlayout.core.parser.CLObject r9 = androidx.constraintlayout.core.parser.CLParser.parse(r9)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            int r1 = r9.size()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r2 = 0
        Le:
            if (r2 >= r1) goto Lda
            androidx.constraintlayout.core.parser.CLElement r3 = r9.get(r2)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            androidx.constraintlayout.core.parser.CLKey r3 = (androidx.constraintlayout.core.parser.CLKey) r3     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.String r4 = r3.content()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            androidx.constraintlayout.core.parser.CLElement r3 = r3.getValue()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            int r5 = r10.get(r4)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6 = -1
            if (r5 != r6) goto L3e
            java.io.PrintStream r3 = java.lang.System.err     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r5.<init>()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.String r6 = "unknown type "
            r5.append(r6)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r5.append(r4)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.String r4 = r5.toString()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r3.println(r4)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            goto Ld2
        L3e:
            int r6 = r11.get(r5)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r7 = 1
            if (r6 == r7) goto Lcb
            r7 = 2
            java.lang.String r8 = "parse "
            if (r6 == r7) goto La3
            r7 = 4
            if (r6 == r7) goto L7b
            r7 = 8
            if (r6 == r7) goto L53
            goto Ld2
        L53:
            java.lang.String r6 = r3.content()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r0.add(r5, r6)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.io.PrintStream r5 = java.lang.System.out     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6.<init>()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6.append(r8)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6.append(r4)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.String r4 = " STRING_MASK > "
            r6.append(r4)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.String r3 = r3.content()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6.append(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.String r3 = r6.toString()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r5.println(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            goto Ld2
        L7b:
            float r6 = r3.getFloat()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r0.add(r5, r6)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.io.PrintStream r5 = java.lang.System.out     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6.<init>()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6.append(r8)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6.append(r4)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.String r4 = " FLOAT_MASK > "
            r6.append(r4)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            float r3 = r3.getFloat()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6.append(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.String r3 = r6.toString()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r5.println(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            goto Ld2
        La3:
            int r6 = r3.getInt()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r0.add(r5, r6)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.io.PrintStream r5 = java.lang.System.out     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6.<init>()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6.append(r8)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6.append(r4)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.String r4 = " INT_MASK > "
            r6.append(r4)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            int r3 = r3.getInt()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r6.append(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            java.lang.String r3 = r6.toString()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r5.println(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            goto Ld2
        Lcb:
            boolean r3 = r9.getBoolean(r2)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
            r0.add(r5, r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> Ld6
        Ld2:
            int r2 = r2 + 1
            goto Le
        Ld6:
            r9 = move-exception
            r9.printStackTrace()
        Lda:
            return r0
    }

    public static androidx.constraintlayout.core.motion.utils.TypedBundle parseAttributes(java.lang.String r2) {
            androidx.constraintlayout.core.motion.parse.KeyParser$$ExternalSyntheticLambda0 r0 = androidx.constraintlayout.core.motion.parse.KeyParser$$ExternalSyntheticLambda0.INSTANCE
            androidx.constraintlayout.core.motion.parse.KeyParser$$ExternalSyntheticLambda0 r1 = androidx.constraintlayout.core.motion.parse.KeyParser$$ExternalSyntheticLambda0.INSTANCE$1
            androidx.constraintlayout.core.motion.utils.TypedBundle r2 = parse(r2, r0, r1)
            return r2
    }
}
