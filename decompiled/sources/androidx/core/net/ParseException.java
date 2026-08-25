package androidx.core.net;

/* JADX INFO: loaded from: classes3.dex */
public class ParseException extends java.lang.RuntimeException {

    @androidx.annotation.NonNull
    public final java.lang.String response;

    public ParseException() {
            r1 = this;
            java.lang.String r0 = "Not a mailto scheme"
            r1.<init>(r0)
            r1.response = r0
            return
    }
}
