package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\u0000\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u00072\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\nH\u0001¢\u0006\u0002\u0010\u000b\u001a!\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a1\u0010\u0010\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007*\u0006\u0012\u0002\b\u00030\nH\u0001\u001a!\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0007\u001aZ\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a0\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001aT\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010!\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\"\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010#\u001a+\u0010$\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\"\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010#\u001aT\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ai\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001727\u0010 \u001a3\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u001aT\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a$\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0001\u001aA\u0010+\u001a\u0002H,\"\b\b\u0000\u0010\u000e*\u00020\u001b\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e0-*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a?\u0010+\u001a\u0002H,\"\b\b\u0000\u0010\u000e*\u00020\u001b\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H\u000e00*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0087@ø\u0001\u0000¢\u0006\u0002\u00101\u001a!\u00102\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a#\u00103\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a`\u00104\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172(\u00106\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\n0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u00107\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00108\u001a\u0002H\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u00109\u001a!\u0010:\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a)\u0010;\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00108\u001a\u0002H\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u00109\u001a#\u0010<\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aZ\u0010=\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u00106\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ao\u0010>\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001727\u00106\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0001ø\u0001\u0000¢\u0006\u0002\u0010(\u001au\u0010?\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u00105*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001729\u00106\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u001a`\u0010@\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u00105*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172$\u00106\u001a \b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a?\u0010A\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`DH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a?\u0010F\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`DH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a!\u0010G\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a$\u0010H\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0007\u001a!\u0010I\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a#\u0010J\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a0\u0010K\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001aT\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a9\u0010M\u001a\u0002H,\"\u0004\b\u0000\u0010\u000e\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H\u000e00*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0081@ø\u0001\u0000¢\u0006\u0002\u00101\u001a;\u0010N\u001a\u0002H,\"\u0004\b\u0000\u0010\u000e\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e0-*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a?\u0010O\u001a\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0P\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010Q*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0R0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aU\u0010O\u001a\u0002HS\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010Q\"\u0018\b\u0002\u0010S*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0015\u0012\u0006\b\u0000\u0012\u0002HQ0T*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0R0\n2\u0006\u0010.\u001a\u0002HSH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010U\u001a'\u0010V\u001a\b\u0012\u0004\u0012\u0002H\u000e0W\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a'\u0010X\u001a\b\u0012\u0004\u0012\u0002H\u000e0Y\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a'\u0010Z\u001a\b\u0012\u0004\u0012\u0002H\u000e0[\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a.\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0]0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001a?\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H50R0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002H50\nH\u0087\u0004\u001az\u0010^\u001a\b\u0012\u0004\u0012\u0002HQ0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105\"\u0004\b\u0002\u0010Q*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002H50\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001726\u00106\u001a2\u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(`\u0012\u0013\u0012\u0011H5¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(a\u0012\u0004\u0012\u0002HQ0\u0019H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, d2 = {"consumesAll", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "channels", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "([Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlin/jvm/functions/Function1;", "any", "", "E", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumes", "count", "", "distinct", "distinctBy", "K", "context", "Lkotlin/coroutines/CoroutineContext;", "selector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "drop", "n", "dropWhile", "predicate", "elementAt", "index", "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elementAtOrNull", "filter", "filterIndexed", "Lkotlin/Function3;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filterNot", "filterNotNull", "filterNotNullTo", "C", "", "destination", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "first", "firstOrNull", "flatMap", "R", "transform", "indexOf", "element", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastIndexOf", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "mapNotNull", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Comparator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "minWith", "none", "requireNoNulls", "single", "singleOrNull", "take", "takeWhile", "toChannel", "toCollection", "toMap", "", "V", "Lkotlin/Pair;", "M", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toMutableList", "", "toMutableSet", "", "toSet", "", "withIndex", "Lkotlin/collections/IndexedValue;", "zip", "other", "a", "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class ChannelsKt__DeprecatedKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1, reason: invalid class name */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {404}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    public static final class AnonymousClass1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.channels.ReceiveChannel L$0;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.any(r2, r1)
                return r2
        }
    }



    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    public static final class C01231<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlin.jvm.internal.Ref.IntRef L$0;
        public kotlinx.coroutines.channels.ReceiveChannel L$1;
        public kotlinx.coroutines.channels.ChannelIterator L$2;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01231(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01231> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.count(r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"E", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C01241 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
        public /* synthetic */ java.lang.Object L$0;

        public C01241(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01241> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1
                r0.<init>(r3)
                r0.L$0 = r2
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(java.lang.Object r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01241) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.ResultKt.throwOnFailure(r1)
                java.lang.Object r1 = r0.L$0
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"E", "K", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    public static final class C01251<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> $selector;
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_distinctBy;
        private /* synthetic */ java.lang.Object L$0;
        public java.util.HashSet L$1;
        public kotlinx.coroutines.channels.ChannelIterator L$2;
        public java.lang.Object L$3;
        public int label;

        public C01251(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01251> r3) {
                r0 = this;
                r0.$this_distinctBy = r1
                r0.$selector = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_distinctBy
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> r2 = r3.$selector
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super E> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01251) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 1
                r3 = 2
                r4 = 3
                if (r1 == 0) goto L4e
                if (r1 == r2) goto L3d
                if (r1 == r3) goto L29
                if (r1 != r4) goto L21
                java.lang.Object r1 = r11.L$3
                kotlinx.coroutines.channels.ChannelIterator r5 = r11.L$2
                java.util.HashSet r6 = r11.L$1
                java.lang.Object r7 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.ResultKt.throwOnFailure(r12)
                r12 = r11
                goto Lbf
            L21:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L29:
                java.lang.Object r1 = r11.L$3
                kotlinx.coroutines.channels.ChannelIterator r5 = r11.L$2
                java.util.HashSet r6 = r11.L$1
                java.lang.Object r7 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.ResultKt.throwOnFailure(r12)
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r11
                goto La2
            L3d:
                kotlinx.coroutines.channels.ChannelIterator r1 = r11.L$2
                java.util.HashSet r5 = r11.L$1
                java.lang.Object r6 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r12)
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r11
                goto L7e
            L4e:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r11.$this_distinctBy
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
                r6 = r12
                r12 = r11
                r10 = r5
                r5 = r1
                r1 = r10
            L65:
                r12.L$0 = r6
                r12.L$1 = r5
                r12.L$2 = r1
                r7 = 0
                r12.L$3 = r7
                r12.label = r2
                java.lang.Object r7 = r1.hasNext(r12)
                if (r7 != r0) goto L77
                return r0
            L77:
                r10 = r0
                r0 = r12
                r12 = r7
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r10
            L7e:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lcc
                java.lang.Object r12 = r5.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> r8 = r0.$selector
                r0.L$0 = r7
                r0.L$1 = r6
                r0.L$2 = r5
                r0.L$3 = r12
                r0.label = r3
                java.lang.Object r8 = r8.invoke(r12, r0)
                if (r8 != r1) goto L9d
                return r1
            L9d:
                r10 = r6
                r6 = r12
                r12 = r8
                r8 = r7
                r7 = r10
            La2:
                boolean r9 = r7.contains(r12)
                if (r9 != 0) goto Lc6
                r0.L$0 = r8
                r0.L$1 = r7
                r0.L$2 = r5
                r0.L$3 = r12
                r0.label = r4
                java.lang.Object r6 = r8.send(r6, r0)
                if (r6 != r1) goto Lb9
                return r1
            Lb9:
                r6 = r7
                r7 = r8
                r10 = r1
                r1 = r12
                r12 = r0
                r0 = r10
            Lbf:
                r6.add(r1)
                r1 = r5
                r5 = r6
                r6 = r7
                goto L65
            Lc6:
                r12 = r0
                r0 = r1
                r1 = r5
                r5 = r7
                r6 = r8
                goto L65
            Lcc:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {164, 169, 170}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    public static final class C01261 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
        public final /* synthetic */ int $n;
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel $this_drop;
        public int I$0;
        private /* synthetic */ java.lang.Object L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public int label;

        public C01261(int r1, kotlinx.coroutines.channels.ReceiveChannel r2, kotlin.coroutines.Continuation r3) {
                r0 = this;
                r0.$n = r1
                r0.$this_drop = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1
                int r1 = r3.$n
                kotlinx.coroutines.channels.ReceiveChannel r2 = r3.$this_drop
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01261) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 2
                r3 = 3
                r4 = 1
                if (r1 == 0) goto L4b
                if (r1 == r4) goto L37
                if (r1 == r2) goto L27
                if (r1 != r3) goto L1f
                kotlinx.coroutines.channels.ChannelIterator r1 = r9.L$1
                java.lang.Object r4 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r1
                r1 = r0
                r0 = r9
                goto La5
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                kotlinx.coroutines.channels.ChannelIterator r1 = r9.L$1
                java.lang.Object r4 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r10)
                r3 = 2
                r2 = r0
                r5 = r4
                r4 = 3
                r0 = r9
                goto Lb9
            L37:
                int r1 = r9.I$0
                kotlinx.coroutines.channels.ChannelIterator r5 = r9.L$1
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r10)
                r2 = r1
                r7 = r6
                r3 = 2
                r4 = 3
                r1 = r0
                r6 = r5
                r5 = 1
                r0 = r9
                goto L7e
            L4b:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
                int r1 = r9.$n
                if (r1 < 0) goto L58
                r5 = 1
                goto L59
            L58:
                r5 = 0
            L59:
                if (r5 == 0) goto Ldb
                if (r1 <= 0) goto L9c
                kotlinx.coroutines.channels.ReceiveChannel r5 = r9.$this_drop
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
                r6 = r10
                r10 = r9
            L65:
                r10.L$0 = r6
                r10.L$1 = r5
                r10.I$0 = r1
                r10.label = r4
                java.lang.Object r7 = r5.hasNext(r10)
                if (r7 != r0) goto L74
                return r0
            L74:
                r8 = r0
                r0 = r10
                r10 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r8
            L7e:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L98
                r6.next()
                int r10 = r2 + (-1)
                if (r10 != 0) goto L8e
                goto L98
            L8e:
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r8 = r1
                r1 = r10
                r10 = r0
                r0 = r8
                goto L65
            L98:
                r2 = r3
                r3 = r4
                r4 = r7
                goto L9f
            L9c:
                r4 = r10
                r1 = r0
                r0 = r9
            L9f:
                kotlinx.coroutines.channels.ReceiveChannel r10 = r0.$this_drop
                kotlinx.coroutines.channels.ChannelIterator r10 = r10.iterator()
            La5:
                r0.L$0 = r4
                r0.L$1 = r10
                r0.label = r2
                java.lang.Object r5 = r10.hasNext(r0)
                if (r5 != r1) goto Lb2
                return r1
            Lb2:
                r8 = r1
                r1 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r8
            Lb9:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Ld8
                java.lang.Object r10 = r1.next()
                r0.L$0 = r5
                r0.L$1 = r1
                r0.label = r4
                java.lang.Object r10 = r5.send(r10, r0)
                if (r10 != r2) goto Ld2
                return r2
            Ld2:
                r10 = r1
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                goto La5
            Ld8:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            Ldb:
                java.lang.String r10 = "Requested element count "
                java.lang.String r0 = " is less than zero."
                java.lang.String r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10, r1, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r10 = r10.toString()
                r0.<init>(r10)
                throw r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {181, 182, 183, 187, 188}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    public static final class C01271 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
        public final /* synthetic */ kotlin.jvm.functions.Function2 $predicate;
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel $this_dropWhile;
        private /* synthetic */ java.lang.Object L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public java.lang.Object L$2;
        public int label;

        public C01271(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.jvm.functions.Function2 r2, kotlin.coroutines.Continuation r3) {
                r0 = this;
                r0.$this_dropWhile = r1
                r0.$predicate = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1
                kotlinx.coroutines.channels.ReceiveChannel r1 = r3.$this_dropWhile
                kotlin.jvm.functions.Function2 r2 = r3.$predicate
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01271) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 0
                r3 = 1
                r4 = 2
                r5 = 3
                r6 = 4
                r7 = 5
                if (r1 == 0) goto L66
                if (r1 == r3) goto L58
                if (r1 == r4) goto L48
                if (r1 == r5) goto L3c
                if (r1 == r6) goto L2e
                if (r1 != r7) goto L26
                kotlinx.coroutines.channels.ChannelIterator r1 = r12.L$1
                java.lang.Object r2 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r13)
                r13 = r1
                r1 = r0
                r0 = r12
                goto Ld0
            L26:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L2e:
                kotlinx.coroutines.channels.ChannelIterator r1 = r12.L$1
                java.lang.Object r2 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r13)
                r3 = r2
                r2 = r0
                r0 = r12
                goto Le2
            L3c:
                java.lang.Object r1 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.ResultKt.throwOnFailure(r13)
                r10 = r1
                r1 = r0
                r0 = r12
                goto Lc2
            L48:
                java.lang.Object r1 = r12.L$2
                kotlinx.coroutines.channels.ChannelIterator r8 = r12.L$1
                java.lang.Object r9 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
                kotlin.ResultKt.throwOnFailure(r13)
                r10 = r9
                r9 = r1
                r1 = r0
                r0 = r12
                goto Lab
            L58:
                kotlinx.coroutines.channels.ChannelIterator r1 = r12.L$1
                java.lang.Object r8 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                kotlin.ResultKt.throwOnFailure(r13)
                r9 = r8
                r8 = r1
                r1 = r0
                r0 = r12
                goto L8a
            L66:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r13 = (kotlinx.coroutines.channels.ProducerScope) r13
                kotlinx.coroutines.channels.ReceiveChannel r1 = r12.$this_dropWhile
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r8 = r13
                r13 = r12
            L75:
                r13.L$0 = r8
                r13.L$1 = r1
                r13.L$2 = r2
                r13.label = r3
                java.lang.Object r9 = r1.hasNext(r13)
                if (r9 != r0) goto L84
                return r0
            L84:
                r11 = r0
                r0 = r13
                r13 = r9
                r9 = r8
                r8 = r1
                r1 = r11
            L8a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lc9
                java.lang.Object r13 = r8.next()
                kotlin.jvm.functions.Function2 r10 = r0.$predicate
                r0.L$0 = r9
                r0.L$1 = r8
                r0.L$2 = r13
                r0.label = r4
                java.lang.Object r10 = r10.invoke(r13, r0)
                if (r10 != r1) goto La7
                return r1
            La7:
                r11 = r9
                r9 = r13
                r13 = r10
                r10 = r11
            Lab:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 != 0) goto Lc4
                r0.L$0 = r10
                r0.L$1 = r2
                r0.L$2 = r2
                r0.label = r5
                java.lang.Object r13 = r10.send(r9, r0)
                if (r13 != r1) goto Lc2
                return r1
            Lc2:
                r2 = r10
                goto Lca
            Lc4:
                r13 = r0
                r0 = r1
                r1 = r8
                r8 = r10
                goto L75
            Lc9:
                r2 = r9
            Lca:
                kotlinx.coroutines.channels.ReceiveChannel r13 = r0.$this_dropWhile
                kotlinx.coroutines.channels.ChannelIterator r13 = r13.iterator()
            Ld0:
                r0.L$0 = r2
                r0.L$1 = r13
                r0.label = r6
                java.lang.Object r3 = r13.hasNext(r0)
                if (r3 != r1) goto Ldd
                return r1
            Ldd:
                r11 = r1
                r1 = r13
                r13 = r3
                r3 = r2
                r2 = r11
            Le2:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lff
                java.lang.Object r13 = r1.next()
                r0.L$0 = r3
                r0.L$1 = r1
                r0.label = r7
                java.lang.Object r13 = r3.send(r13, r0)
                if (r13 != r2) goto Lfb
                return r2
            Lfb:
                r13 = r1
                r1 = r2
                r2 = r3
                goto Ld0
            Lff:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {38}, m = "elementAt", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    public static final class C01281<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public int I$0;
        public int I$1;
        public kotlinx.coroutines.channels.ReceiveChannel L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01281(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01281> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                r0 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.elementAt(r2, r0, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {53}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    public static final class C01291<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public int I$0;
        public int I$1;
        public kotlinx.coroutines.channels.ReceiveChannel L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01291(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01291> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                r0 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.elementAtOrNull(r2, r0, r1)
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {198, 199, 199}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    public static final class C01301<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_filter;
        private /* synthetic */ java.lang.Object L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public java.lang.Object L$2;
        public int label;

        public C01301(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01301> r3) {
                r0 = this;
                r0.$this_filter = r1
                r0.$predicate = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_filter
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r2 = r3.$predicate
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super E> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01301) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 0
                r3 = 1
                r4 = 2
                r5 = 3
                if (r1 == 0) goto L42
                if (r1 == r3) goto L34
                if (r1 == r4) goto L24
                if (r1 != r5) goto L1c
                kotlinx.coroutines.channels.ChannelIterator r1 = r10.L$1
                java.lang.Object r6 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r11)
                goto L50
            L1c:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L24:
                java.lang.Object r1 = r10.L$2
                kotlinx.coroutines.channels.ChannelIterator r6 = r10.L$1
                java.lang.Object r7 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.ResultKt.throwOnFailure(r11)
                r8 = r7
                r7 = r1
                r1 = r0
                r0 = r10
                goto L87
            L34:
                kotlinx.coroutines.channels.ChannelIterator r1 = r10.L$1
                java.lang.Object r6 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r10
                goto L66
            L42:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                r6 = r11
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlinx.coroutines.channels.ReceiveChannel<E> r11 = r10.$this_filter
                kotlinx.coroutines.channels.ChannelIterator r1 = r11.iterator()
            L50:
                r11 = r10
            L51:
                r11.L$0 = r6
                r11.L$1 = r1
                r11.L$2 = r2
                r11.label = r3
                java.lang.Object r7 = r1.hasNext(r11)
                if (r7 != r0) goto L60
                return r0
            L60:
                r9 = r0
                r0 = r11
                r11 = r7
                r7 = r6
                r6 = r1
                r1 = r9
            L66:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La3
                java.lang.Object r11 = r6.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r8 = r0.$predicate
                r0.L$0 = r7
                r0.L$1 = r6
                r0.L$2 = r11
                r0.label = r4
                java.lang.Object r8 = r8.invoke(r11, r0)
                if (r8 != r1) goto L83
                return r1
            L83:
                r9 = r7
                r7 = r11
                r11 = r8
                r8 = r9
            L87:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L9e
                r0.L$0 = r8
                r0.L$1 = r6
                r0.L$2 = r2
                r0.label = r5
                java.lang.Object r11 = r8.send(r7, r0)
                if (r11 != r1) goto L9e
                return r1
            L9e:
                r11 = r0
                r0 = r1
                r1 = r6
                r6 = r8
                goto L51
            La3:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    public static final class C01311 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
        public final /* synthetic */ kotlin.jvm.functions.Function3 $predicate;
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel $this_filterIndexed;
        public int I$0;
        private /* synthetic */ java.lang.Object L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public java.lang.Object L$2;
        public int label;

        public C01311(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.jvm.functions.Function3 r2, kotlin.coroutines.Continuation r3) {
                r0 = this;
                r0.$this_filterIndexed = r1
                r0.$predicate = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1
                kotlinx.coroutines.channels.ReceiveChannel r1 = r3.$this_filterIndexed
                kotlin.jvm.functions.Function3 r2 = r3.$predicate
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01311) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 0
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L4c
                if (r1 == r5) goto L3b
                if (r1 == r3) goto L26
                if (r1 != r4) goto L1e
                int r1 = r12.I$0
                kotlinx.coroutines.channels.ChannelIterator r6 = r12.L$1
                java.lang.Object r7 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.ResultKt.throwOnFailure(r13)
                goto L5b
            L1e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L26:
                int r1 = r12.I$0
                java.lang.Object r6 = r12.L$2
                kotlinx.coroutines.channels.ChannelIterator r7 = r12.L$1
                java.lang.Object r8 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                kotlin.ResultKt.throwOnFailure(r13)
                r10 = r1
                r1 = r0
                r0 = r12
                r11 = r7
                r7 = r6
            L38:
                r6 = r11
                goto L9d
            L3b:
                int r1 = r12.I$0
                kotlinx.coroutines.channels.ChannelIterator r6 = r12.L$1
                java.lang.Object r7 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.ResultKt.throwOnFailure(r13)
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r12
                goto L74
            L4c:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                r7 = r13
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                r1 = 0
                kotlinx.coroutines.channels.ReceiveChannel r13 = r12.$this_filterIndexed
                kotlinx.coroutines.channels.ChannelIterator r6 = r13.iterator()
            L5b:
                r13 = r12
            L5c:
                r13.L$0 = r7
                r13.L$1 = r6
                r13.L$2 = r2
                r13.I$0 = r1
                r13.label = r5
                java.lang.Object r8 = r6.hasNext(r13)
                if (r8 != r0) goto L6d
                return r0
            L6d:
                r11 = r0
                r0 = r13
                r13 = r8
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r11
            L74:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lbb
                java.lang.Object r13 = r7.next()
                kotlin.jvm.functions.Function3 r9 = r0.$predicate
                int r10 = r6 + 1
                java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
                r0.L$0 = r8
                r0.L$1 = r7
                r0.L$2 = r13
                r0.I$0 = r10
                r0.label = r3
                java.lang.Object r6 = r9.invoke(r6, r13, r0)
                if (r6 != r1) goto L99
                return r1
            L99:
                r11 = r7
                r7 = r13
                r13 = r6
                goto L38
            L9d:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb6
                r0.L$0 = r8
                r0.L$1 = r6
                r0.L$2 = r2
                r0.I$0 = r10
                r0.label = r4
                java.lang.Object r13 = r8.send(r7, r0)
                if (r13 != r1) goto Lb6
                return r1
            Lb6:
                r13 = r0
                r0 = r1
                r7 = r8
                r1 = r10
                goto L5c
            Lbb:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"E", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    public static final class C01321 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
        public final /* synthetic */ kotlin.jvm.functions.Function2 $predicate;
        public /* synthetic */ java.lang.Object L$0;
        public int label;

        public C01321(kotlin.jvm.functions.Function2 r1, kotlin.coroutines.Continuation r2) {
                r0 = this;
                r0.$predicate = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1
                kotlin.jvm.functions.Function2 r1 = r2.$predicate
                r0.<init>(r1, r4)
                r0.L$0 = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(java.lang.Object r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01321) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                java.lang.Object r4 = r3.L$0
                kotlin.jvm.functions.Function2 r1 = r3.$predicate
                r3.label = r2
                java.lang.Object r4 = r1.invoke(r4, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r4 = r4 ^ r2
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
                return r4
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u008a@"}, d2 = {"", "E", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C01331<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        public /* synthetic */ java.lang.Object L$0;

        public C01331(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01331> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1
                r0.<init>(r3)
                r0.L$0 = r2
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.Nullable E r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01331) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.ResultKt.throwOnFailure(r1)
                java.lang.Object r1 = r0.L$0
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    public static final class C01341<E, C extends java.util.Collection<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public java.util.Collection L$0;
        public kotlinx.coroutines.channels.ReceiveChannel L$1;
        public kotlinx.coroutines.channels.ChannelIterator L$2;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01341(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01341> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.filterNotNullTo(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3, reason: invalid class name */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 242}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class AnonymousClass3<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.channels.SendChannel L$0;
        public kotlinx.coroutines.channels.ReceiveChannel L$1;
        public kotlinx.coroutines.channels.ChannelIterator L$2;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public AnonymousClass3(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.filterNotNullTo(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {65}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    public static final class C01351<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.channels.ReceiveChannel L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01351(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01351> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.first(r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {75}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    public static final class C01361<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.channels.ReceiveChannel L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01361(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01361> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.firstOrNull(r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    public static final class C01371 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel $this_flatMap;
        public final /* synthetic */ kotlin.jvm.functions.Function2 $transform;
        private /* synthetic */ java.lang.Object L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public int label;

        public C01371(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.jvm.functions.Function2 r2, kotlin.coroutines.Continuation r3) {
                r0 = this;
                r0.$this_flatMap = r1
                r0.$transform = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1
                kotlinx.coroutines.channels.ReceiveChannel r1 = r3.$this_flatMap
                kotlin.jvm.functions.Function2 r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01371) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 1
                r3 = 2
                r4 = 3
                if (r1 == 0) goto L3f
                if (r1 == r2) goto L31
                if (r1 == r3) goto L23
                if (r1 != r4) goto L1b
                kotlinx.coroutines.channels.ChannelIterator r1 = r9.L$1
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r10)
                goto L4d
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                kotlinx.coroutines.channels.ChannelIterator r1 = r9.L$1
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L7c
            L31:
                kotlinx.coroutines.channels.ChannelIterator r1 = r9.L$1
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L61
            L3f:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                r5 = r10
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlinx.coroutines.channels.ReceiveChannel r10 = r9.$this_flatMap
                kotlinx.coroutines.channels.ChannelIterator r1 = r10.iterator()
            L4d:
                r10 = r9
            L4e:
                r10.L$0 = r5
                r10.L$1 = r1
                r10.label = r2
                java.lang.Object r6 = r1.hasNext(r10)
                if (r6 != r0) goto L5b
                return r0
            L5b:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L61:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L90
                java.lang.Object r10 = r5.next()
                kotlin.jvm.functions.Function2 r7 = r0.$transform
                r0.L$0 = r6
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r10 = r7.invoke(r10, r0)
                if (r10 != r1) goto L7c
                return r1
            L7c:
                kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
                r0.L$0 = r6
                r0.L$1 = r5
                r0.label = r4
                java.lang.Object r10 = kotlinx.coroutines.channels.ChannelsKt.toChannel(r10, r6, r0)
                if (r10 != r1) goto L8b
                return r1
            L8b:
                r10 = r0
                r0 = r1
                r1 = r5
                r5 = r6
                goto L4e
            L90:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {487}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class C01381<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public java.lang.Object L$0;
        public kotlin.jvm.internal.Ref.IntRef L$1;
        public kotlinx.coroutines.channels.ReceiveChannel L$2;
        public kotlinx.coroutines.channels.ChannelIterator L$3;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01381(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01381> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.indexOf(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {97, 100}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class C01391<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.channels.ReceiveChannel L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public java.lang.Object L$2;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01391(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01391> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.last(r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {487}, m = "lastIndexOf", n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C01401<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public java.lang.Object L$0;
        public kotlin.jvm.internal.Ref.IntRef L$1;
        public kotlin.jvm.internal.Ref.IntRef L$2;
        public kotlinx.coroutines.channels.ReceiveChannel L$3;
        public kotlinx.coroutines.channels.ChannelIterator L$4;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01401(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01401> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.lastIndexOf(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {123, 126}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class C01411<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.channels.ReceiveChannel L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public java.lang.Object L$2;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01411(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01411> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.lastOrNull(r2, r1)
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    public static final class C01421<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_map;
        public final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        public kotlin.jvm.functions.Function2 L$1;
        public kotlinx.coroutines.channels.ReceiveChannel L$2;
        public kotlinx.coroutines.channels.ChannelIterator L$3;
        public kotlinx.coroutines.channels.ProducerScope L$4;
        public int label;

        public C01421(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01421> r3) {
                r0 = this;
                r0.$this_map = r1
                r0.$transform = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_map
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super R> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01421) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 0
                r3 = 1
                r4 = 2
                r5 = 3
                if (r1 == 0) goto L52
                if (r1 == r3) goto L3f
                if (r1 == r4) goto L28
                if (r1 != r5) goto L20
                kotlinx.coroutines.channels.ChannelIterator r1 = r12.L$3
                kotlinx.coroutines.channels.ReceiveChannel r6 = r12.L$2
                kotlin.jvm.functions.Function2 r7 = r12.L$1
                java.lang.Object r8 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> Lc2
                goto L62
            L20:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L28:
                kotlinx.coroutines.channels.ProducerScope r1 = r12.L$4
                kotlinx.coroutines.channels.ChannelIterator r6 = r12.L$3
                kotlinx.coroutines.channels.ReceiveChannel r7 = r12.L$2
                kotlin.jvm.functions.Function2 r8 = r12.L$1
                java.lang.Object r9 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
                kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> Lb7
                r10 = r9
                r9 = r8
                r8 = r1
                r1 = r0
                r0 = r13
                r13 = r12
                goto L9e
            L3f:
                kotlinx.coroutines.channels.ChannelIterator r1 = r12.L$3
                kotlinx.coroutines.channels.ReceiveChannel r6 = r12.L$2
                kotlin.jvm.functions.Function2 r7 = r12.L$1
                java.lang.Object r8 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> Lc2
                r9 = r7
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r12
                goto L7b
            L52:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                r8 = r13
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                kotlinx.coroutines.channels.ReceiveChannel<E> r6 = r12.$this_map
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r7 = r12.$transform
                kotlinx.coroutines.channels.ChannelIterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> Lc2
            L62:
                r13 = r12
            L63:
                r13.L$0 = r8     // Catch: java.lang.Throwable -> Lc2
                r13.L$1 = r7     // Catch: java.lang.Throwable -> Lc2
                r13.L$2 = r6     // Catch: java.lang.Throwable -> Lc2
                r13.L$3 = r1     // Catch: java.lang.Throwable -> Lc2
                r13.label = r3     // Catch: java.lang.Throwable -> Lc2
                java.lang.Object r9 = r1.hasNext(r13)     // Catch: java.lang.Throwable -> Lc2
                if (r9 != r0) goto L74
                return r0
            L74:
                r11 = r0
                r0 = r13
                r13 = r9
                r9 = r7
                r7 = r6
                r6 = r1
                r1 = r11
            L7b:
                java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> Lbf
                boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> Lbf
                if (r13 == 0) goto Lb9
                java.lang.Object r13 = r6.next()     // Catch: java.lang.Throwable -> Lbf
                r0.L$0 = r8     // Catch: java.lang.Throwable -> Lbf
                r0.L$1 = r9     // Catch: java.lang.Throwable -> Lbf
                r0.L$2 = r7     // Catch: java.lang.Throwable -> Lbf
                r0.L$3 = r6     // Catch: java.lang.Throwable -> Lbf
                r0.L$4 = r8     // Catch: java.lang.Throwable -> Lbf
                r0.label = r4     // Catch: java.lang.Throwable -> Lbf
                java.lang.Object r13 = r9.invoke(r13, r0)     // Catch: java.lang.Throwable -> Lbf
                if (r13 != r1) goto L9a
                return r1
            L9a:
                r10 = r8
                r11 = r0
                r0 = r13
                r13 = r11
            L9e:
                r13.L$0 = r10     // Catch: java.lang.Throwable -> Lb7
                r13.L$1 = r9     // Catch: java.lang.Throwable -> Lb7
                r13.L$2 = r7     // Catch: java.lang.Throwable -> Lb7
                r13.L$3 = r6     // Catch: java.lang.Throwable -> Lb7
                r13.L$4 = r2     // Catch: java.lang.Throwable -> Lb7
                r13.label = r5     // Catch: java.lang.Throwable -> Lb7
                java.lang.Object r0 = r8.send(r0, r13)     // Catch: java.lang.Throwable -> Lb7
                if (r0 != r1) goto Lb1
                return r1
            Lb1:
                r0 = r1
                r1 = r6
                r6 = r7
                r7 = r9
                r8 = r10
                goto L63
            Lb7:
                r13 = move-exception
                goto Lc4
            Lb9:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbf
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r2)
                return r13
            Lbf:
                r13 = move-exception
                r6 = r7
                goto Lc3
            Lc2:
                r13 = move-exception
            Lc3:
                r7 = r6
            Lc4:
                throw r13     // Catch: java.lang.Throwable -> Lc5
            Lc5:
                r0 = move-exception
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r13)
                throw r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    public static final class C01431<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_mapIndexed;
        public final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        public int I$0;
        private /* synthetic */ java.lang.Object L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public kotlinx.coroutines.channels.ProducerScope L$2;
        public int label;

        public C01431(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01431> r3) {
                r0 = this;
                r0.$this_mapIndexed = r1
                r0.$transform = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_mapIndexed
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super R> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01431) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 2
                r3 = 3
                r4 = 1
                if (r1 == 0) goto L4b
                if (r1 == r4) goto L3b
                if (r1 == r2) goto L25
                if (r1 != r3) goto L1d
                int r1 = r11.I$0
                kotlinx.coroutines.channels.ChannelIterator r5 = r11.L$1
                java.lang.Object r6 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r12)
                goto L5a
            L1d:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L25:
                int r1 = r11.I$0
                kotlinx.coroutines.channels.ProducerScope r5 = r11.L$2
                kotlinx.coroutines.channels.ChannelIterator r6 = r11.L$1
                java.lang.Object r7 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.ResultKt.throwOnFailure(r12)
                r9 = r1
                r1 = r0
                r0 = r12
                r12 = r11
                r10 = r6
                r6 = r5
                r5 = r10
                goto L9a
            L3b:
                int r1 = r11.I$0
                kotlinx.coroutines.channels.ChannelIterator r5 = r11.L$1
                java.lang.Object r6 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r12)
                r7 = r5
                r5 = r1
                r1 = r0
                r0 = r11
                goto L70
            L4b:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                r6 = r12
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                r1 = 0
                kotlinx.coroutines.channels.ReceiveChannel<E> r12 = r11.$this_mapIndexed
                kotlinx.coroutines.channels.ChannelIterator r5 = r12.iterator()
            L5a:
                r12 = r11
            L5b:
                r12.L$0 = r6
                r12.L$1 = r5
                r12.I$0 = r1
                r12.label = r4
                java.lang.Object r7 = r5.hasNext(r12)
                if (r7 != r0) goto L6a
                return r0
            L6a:
                r10 = r0
                r0 = r12
                r12 = r7
                r7 = r5
                r5 = r1
                r1 = r10
            L70:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lb0
                java.lang.Object r12 = r7.next()
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r0.$transform
                int r9 = r5 + 1
                java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
                r0.L$0 = r6
                r0.L$1 = r7
                r0.L$2 = r6
                r0.I$0 = r9
                r0.label = r2
                java.lang.Object r12 = r8.invoke(r5, r12, r0)
                if (r12 != r1) goto L95
                return r1
            L95:
                r5 = r7
                r7 = r6
                r10 = r0
                r0 = r12
                r12 = r10
            L9a:
                r12.L$0 = r7
                r12.L$1 = r5
                r8 = 0
                r12.L$2 = r8
                r12.I$0 = r9
                r12.label = r3
                java.lang.Object r0 = r6.send(r0, r12)
                if (r0 != r1) goto Lac
                return r1
            Lac:
                r0 = r1
                r6 = r7
                r1 = r9
                goto L5b
            Lb0:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {420, 422}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    public static final class C01441<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public java.util.Comparator L$0;
        public kotlinx.coroutines.channels.ReceiveChannel L$1;
        public kotlinx.coroutines.channels.ChannelIterator L$2;
        public java.lang.Object L$3;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01441(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01441> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.maxWith(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {434, 436}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    public static final class C01451<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public java.util.Comparator L$0;
        public kotlinx.coroutines.channels.ReceiveChannel L$1;
        public kotlinx.coroutines.channels.ChannelIterator L$2;
        public java.lang.Object L$3;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01451(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01451> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.minWith(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {447}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    public static final class C01461<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.channels.ReceiveChannel L$0;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01461(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01461> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.none(r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u008a@"}, d2 = {"", "E", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C01471 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel $this_requireNoNulls;
        public /* synthetic */ java.lang.Object L$0;

        public C01471(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
                r0 = this;
                r0.$this_requireNoNulls = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1
                kotlinx.coroutines.channels.ReceiveChannel r1 = r2.$this_requireNoNulls
                r0.<init>(r1, r4)
                r0.L$0 = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01471) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
                r2 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.ResultKt.throwOnFailure(r3)
                java.lang.Object r3 = r2.L$0
                if (r3 == 0) goto Lb
                return r3
            Lb:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "null element found in "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                kotlinx.coroutines.channels.ReceiveChannel r1 = r2.$this_requireNoNulls
                r0.append(r1)
                r1 = 46
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {136, 139}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C01481<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.channels.ReceiveChannel L$0;
        public java.lang.Object L$1;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01481(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01481> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.single(r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {149, 152}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C01491<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.channels.ReceiveChannel L$0;
        public java.lang.Object L$1;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01491(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01491> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.singleOrNull(r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {254, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    public static final class C01501 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
        public final /* synthetic */ int $n;
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel $this_take;
        public int I$0;
        private /* synthetic */ java.lang.Object L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public int label;

        public C01501(int r1, kotlinx.coroutines.channels.ReceiveChannel r2, kotlin.coroutines.Continuation r3) {
                r0 = this;
                r0.$n = r1
                r0.$this_take = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1
                int r1 = r3.$n
                kotlinx.coroutines.channels.ReceiveChannel r2 = r3.$this_take
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01501) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L32
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                int r1 = r8.I$0
                kotlinx.coroutines.channels.ChannelIterator r4 = r8.L$1
                java.lang.Object r5 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r5
                r5 = r8
                goto L7c
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                int r1 = r8.I$0
                kotlinx.coroutines.channels.ChannelIterator r4 = r8.L$1
                java.lang.Object r5 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r9)
                r6 = r5
                r5 = r8
                goto L60
            L32:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
                int r1 = r8.$n
                if (r1 != 0) goto L40
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            L40:
                if (r1 < 0) goto L44
                r4 = 1
                goto L45
            L44:
                r4 = 0
            L45:
                if (r4 == 0) goto L86
                kotlinx.coroutines.channels.ReceiveChannel r4 = r8.$this_take
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
                r5 = r8
            L4e:
                r5.L$0 = r9
                r5.L$1 = r4
                r5.I$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.hasNext(r5)
                if (r6 != r0) goto L5d
                return r0
            L5d:
                r7 = r6
                r6 = r9
                r9 = r7
            L60:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L83
                java.lang.Object r9 = r4.next()
                r5.L$0 = r6
                r5.L$1 = r4
                r5.I$0 = r1
                r5.label = r2
                java.lang.Object r9 = r6.send(r9, r5)
                if (r9 != r0) goto L7b
                return r0
            L7b:
                r9 = r6
            L7c:
                int r1 = r1 + (-1)
                if (r1 != 0) goto L4e
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            L83:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            L86:
                java.lang.String r9 = "Requested element count "
                java.lang.String r0 = " is less than zero."
                java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r1, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {269, 270, 271}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    public static final class C01511 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
        public final /* synthetic */ kotlin.jvm.functions.Function2 $predicate;
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel $this_takeWhile;
        private /* synthetic */ java.lang.Object L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public java.lang.Object L$2;
        public int label;

        public C01511(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.jvm.functions.Function2 r2, kotlin.coroutines.Continuation r3) {
                r0 = this;
                r0.$this_takeWhile = r1
                r0.$predicate = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1
                kotlinx.coroutines.channels.ReceiveChannel r1 = r3.$this_takeWhile
                kotlin.jvm.functions.Function2 r2 = r3.$predicate
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01511) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 1
                r3 = 2
                r4 = 3
                if (r1 == 0) goto L41
                if (r1 == r2) goto L33
                if (r1 == r3) goto L23
                if (r1 != r4) goto L1b
                kotlinx.coroutines.channels.ChannelIterator r1 = r9.L$1
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r10)
                goto L4f
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.L$2
                kotlinx.coroutines.channels.ChannelIterator r5 = r9.L$1
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r10)
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r9
                goto L84
            L33:
                kotlinx.coroutines.channels.ChannelIterator r1 = r9.L$1
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L63
            L41:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                r5 = r10
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlinx.coroutines.channels.ReceiveChannel r10 = r9.$this_takeWhile
                kotlinx.coroutines.channels.ChannelIterator r1 = r10.iterator()
            L4f:
                r10 = r9
            L50:
                r10.L$0 = r5
                r10.L$1 = r1
                r10.label = r2
                java.lang.Object r6 = r1.hasNext(r10)
                if (r6 != r0) goto L5d
                return r0
            L5d:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L63:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto La4
                java.lang.Object r10 = r5.next()
                kotlin.jvm.functions.Function2 r7 = r0.$predicate
                r0.L$0 = r6
                r0.L$1 = r5
                r0.L$2 = r10
                r0.label = r3
                java.lang.Object r7 = r7.invoke(r10, r0)
                if (r7 != r1) goto L80
                return r1
            L80:
                r8 = r6
                r6 = r10
                r10 = r7
                r7 = r8
            L84:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L8f
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            L8f:
                r0.L$0 = r7
                r0.L$1 = r5
                r10 = 0
                r0.L$2 = r10
                r0.label = r4
                java.lang.Object r10 = r7.send(r6, r0)
                if (r10 != r1) goto L9f
                return r1
            L9f:
                r10 = r0
                r0 = r1
                r1 = r5
                r5 = r7
                goto L50
            La4:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 278}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C01521<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.channels.SendChannel L$0;
        public kotlinx.coroutines.channels.ReceiveChannel L$1;
        public kotlinx.coroutines.channels.ChannelIterator L$2;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01521(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01521> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.toChannel(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    public static final class C01531<E, C extends java.util.Collection<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public java.util.Collection L$0;
        public kotlinx.coroutines.channels.ReceiveChannel L$1;
        public kotlinx.coroutines.channels.ChannelIterator L$2;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01531(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01531> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.toCollection(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2, reason: invalid class name */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass2<K, V, M extends java.util.Map<? super K, ? super V>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public java.util.Map L$0;
        public kotlinx.coroutines.channels.ReceiveChannel L$1;
        public kotlinx.coroutines.channels.ChannelIterator L$2;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public AnonymousClass2(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelsKt.toMap(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/collections/IndexedValue;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
    public static final class C01541 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel $this_withIndex;
        public int I$0;
        private /* synthetic */ java.lang.Object L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public int label;

        public C01541(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
                r0 = this;
                r0.$this_withIndex = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1
                kotlinx.coroutines.channels.ReceiveChannel r1 = r2.$this_withIndex
                r0.<init>(r1, r4)
                r0.L$0 = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01541) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L33
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                int r1 = r10.I$0
                kotlinx.coroutines.channels.ChannelIterator r4 = r10.L$1
                java.lang.Object r5 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                goto L42
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                int r1 = r10.I$0
                kotlinx.coroutines.channels.ChannelIterator r4 = r10.L$1
                java.lang.Object r5 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r10
                goto L59
            L33:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                r5 = r11
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                r1 = 0
                kotlinx.coroutines.channels.ReceiveChannel r11 = r10.$this_withIndex
                kotlinx.coroutines.channels.ChannelIterator r4 = r11.iterator()
            L42:
                r11 = r10
            L43:
                r11.L$0 = r5
                r11.L$1 = r4
                r11.I$0 = r1
                r11.label = r3
                java.lang.Object r6 = r4.hasNext(r11)
                if (r6 != r0) goto L52
                return r0
            L52:
                r9 = r0
                r0 = r11
                r11 = r6
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r9
            L59:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L81
                java.lang.Object r11 = r5.next()
                kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue
                int r8 = r4 + 1
                r7.<init>(r4, r11)
                r0.L$0 = r6
                r0.L$1 = r5
                r0.I$0 = r8
                r0.label = r2
                java.lang.Object r11 = r6.send(r7, r0)
                if (r11 != r1) goto L7b
                return r1
            L7b:
                r11 = r0
                r0 = r1
                r4 = r5
                r5 = r6
                r1 = r8
                goto L43
            L81:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }


    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@"}, d2 = {"E", "R", "V", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {487, 469, 471}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    public static final class C01562<V> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super V>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<R> $other;
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_zip;
        public final /* synthetic */ kotlin.jvm.functions.Function2<E, R, V> $transform;
        private /* synthetic */ java.lang.Object L$0;
        public kotlinx.coroutines.channels.ChannelIterator L$1;
        public kotlin.jvm.functions.Function2 L$2;
        public kotlinx.coroutines.channels.ReceiveChannel L$3;
        public kotlinx.coroutines.channels.ChannelIterator L$4;
        public java.lang.Object L$5;
        public int label;

        public C01562(kotlinx.coroutines.channels.ReceiveChannel<? extends R> r1, kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01562> r4) {
                r0 = this;
                r0.$other = r1
                r0.$this_zip = r2
                r0.$transform = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2
                kotlinx.coroutines.channels.ReceiveChannel<R> r1 = r4.$other
                kotlinx.coroutines.channels.ReceiveChannel<E> r2 = r4.$this_zip
                kotlin.jvm.functions.Function2<E, R, V> r3 = r4.$transform
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super V> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01562) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.label
                r2 = 1
                r3 = 2
                r4 = 3
                r5 = 0
                if (r1 == 0) goto L5f
                if (r1 == r2) goto L48
                if (r1 == r3) goto L2a
                if (r1 != r4) goto L22
                kotlinx.coroutines.channels.ChannelIterator r1 = r13.L$4
                kotlinx.coroutines.channels.ReceiveChannel r6 = r13.L$3
                kotlin.jvm.functions.Function2 r7 = r13.L$2
                kotlinx.coroutines.channels.ChannelIterator r8 = r13.L$1
                java.lang.Object r9 = r13.L$0
                kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
                kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Throwable -> Lf5
                goto L75
            L22:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L2a:
                java.lang.Object r1 = r13.L$5
                kotlinx.coroutines.channels.ChannelIterator r6 = r13.L$4
                kotlinx.coroutines.channels.ReceiveChannel r7 = r13.L$3
                kotlin.jvm.functions.Function2 r8 = r13.L$2
                kotlinx.coroutines.channels.ChannelIterator r9 = r13.L$1
                java.lang.Object r10 = r13.L$0
                kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
                kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Throwable -> L45
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r13
                goto Lbd
            L45:
                r14 = move-exception
                goto Lf3
            L48:
                kotlinx.coroutines.channels.ChannelIterator r1 = r13.L$4
                kotlinx.coroutines.channels.ReceiveChannel r6 = r13.L$3
                kotlin.jvm.functions.Function2 r7 = r13.L$2
                kotlinx.coroutines.channels.ChannelIterator r8 = r13.L$1
                java.lang.Object r9 = r13.L$0
                kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
                kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Throwable -> Lf5
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r13
                goto L94
            L5f:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r14 = r13.L$0
                r9 = r14
                kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
                kotlinx.coroutines.channels.ReceiveChannel<R> r14 = r13.$other
                kotlinx.coroutines.channels.ChannelIterator r8 = r14.iterator()
                kotlinx.coroutines.channels.ReceiveChannel<E> r6 = r13.$this_zip
                kotlin.jvm.functions.Function2<E, R, V> r7 = r13.$transform
                kotlinx.coroutines.channels.ChannelIterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> Lf5
            L75:
                r14 = r13
            L76:
                r14.L$0 = r9     // Catch: java.lang.Throwable -> Lf5
                r14.L$1 = r8     // Catch: java.lang.Throwable -> Lf5
                r14.L$2 = r7     // Catch: java.lang.Throwable -> Lf5
                r14.L$3 = r6     // Catch: java.lang.Throwable -> Lf5
                r14.L$4 = r1     // Catch: java.lang.Throwable -> Lf5
                r14.L$5 = r5     // Catch: java.lang.Throwable -> Lf5
                r14.label = r2     // Catch: java.lang.Throwable -> Lf5
                java.lang.Object r10 = r1.hasNext(r14)     // Catch: java.lang.Throwable -> Lf5
                if (r10 != r0) goto L8b
                return r0
            L8b:
                r12 = r0
                r0 = r14
                r14 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r12
            L94:
                java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L45
                boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L45
                if (r14 == 0) goto Led
                java.lang.Object r14 = r6.next()     // Catch: java.lang.Throwable -> L45
                r0.L$0 = r10     // Catch: java.lang.Throwable -> L45
                r0.L$1 = r9     // Catch: java.lang.Throwable -> L45
                r0.L$2 = r8     // Catch: java.lang.Throwable -> L45
                r0.L$3 = r7     // Catch: java.lang.Throwable -> L45
                r0.L$4 = r6     // Catch: java.lang.Throwable -> L45
                r0.L$5 = r14     // Catch: java.lang.Throwable -> L45
                r0.label = r3     // Catch: java.lang.Throwable -> L45
                java.lang.Object r11 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> L45
                if (r11 != r1) goto Lb5
                return r1
            Lb5:
                r12 = r6
                r6 = r14
                r14 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r12
            Lbd:
                java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> Leb
                boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> Leb
                if (r14 != 0) goto Lc6
                goto Le3
            Lc6:
                java.lang.Object r14 = r10.next()     // Catch: java.lang.Throwable -> Leb
                java.lang.Object r14 = r9.invoke(r6, r14)     // Catch: java.lang.Throwable -> Leb
                r0.L$0 = r11     // Catch: java.lang.Throwable -> Leb
                r0.L$1 = r10     // Catch: java.lang.Throwable -> Leb
                r0.L$2 = r9     // Catch: java.lang.Throwable -> Leb
                r0.L$3 = r8     // Catch: java.lang.Throwable -> Leb
                r0.L$4 = r7     // Catch: java.lang.Throwable -> Leb
                r0.L$5 = r5     // Catch: java.lang.Throwable -> Leb
                r0.label = r4     // Catch: java.lang.Throwable -> Leb
                java.lang.Object r14 = r11.send(r14, r0)     // Catch: java.lang.Throwable -> Leb
                if (r14 != r1) goto Le3
                return r1
            Le3:
                r14 = r0
                r0 = r1
                r1 = r7
                r6 = r8
                r7 = r9
                r8 = r10
                r9 = r11
                goto L76
            Leb:
                r14 = move-exception
                goto Lf7
            Led:
                kotlin.Unit r14 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L45
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r5)
                return r14
            Lf3:
                r8 = r7
                goto Lf7
            Lf5:
                r14 = move-exception
                r8 = r6
            Lf7:
                throw r14     // Catch: java.lang.Throwable -> Lf8
            Lf8:
                r0 = move-exception
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r14)
                throw r0
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel r4, kotlin.coroutines.Continuation r5) {
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlinx.coroutines.channels.ReceiveChannel r4 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L4a
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.channels.ChannelIterator r5 = r4.iterator()     // Catch: java.lang.Throwable -> L4a
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L4a
            r0.label = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L4a
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r0)
            return r5
        L4a:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            throw r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumes(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<?> r1) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumes$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumes$1
            r0.<init>(r1)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumesAll(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<?>... r1) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumesAll$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumesAll$1
            r0.<init>(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.Continuation r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01231
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01231) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            kotlinx.coroutines.channels.ChannelIterator r7 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r2 = r0.L$1
            kotlin.jvm.internal.Ref$IntRef r4 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L32
            r6 = r2
            r2 = r7
            r7 = r6
            goto L58
        L32:
            r7 = move-exception
            goto L79
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
            r8.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L76
            r4 = r8
        L49:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L76
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L76
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L76
            r0.label = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r8 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> L76
            if (r8 != r1) goto L58
            return r1
        L58:
            r5 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L76
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L76
            if (r8 == 0) goto L6a
            r2.next()     // Catch: java.lang.Throwable -> L76
            int r8 = r4.element     // Catch: java.lang.Throwable -> L76
            int r8 = r8 + r3
            r4.element = r8     // Catch: java.lang.Throwable -> L76
            goto L49
        L6a:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L76
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r5)
            int r7 = r4.element
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            return r7
        L76:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L79:
            throw r7     // Catch: java.lang.Throwable -> L7a
        L7a:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r7)
            throw r8
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel distinct(kotlinx.coroutines.channels.ReceiveChannel r3) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1
            r1 = 0
            r0.<init>(r1)
            r2 = 1
            kotlinx.coroutines.channels.ReceiveChannel r3 = kotlinx.coroutines.channels.ChannelsKt.distinctBy$default(r3, r1, r0, r2, r1)
            return r3
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E, K> kotlinx.coroutines.channels.ReceiveChannel<E> distinctBy(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> r10) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.channels.ChannelsKt.consumes(r8)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1
            r1 = 0
            r5.<init>(r8, r10, r1)
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r1 = r9
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel distinctBy$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.distinctBy(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop(kotlinx.coroutines.channels.ReceiveChannel r8, int r9, kotlin.coroutines.CoroutineContext r10) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.channels.ChannelsKt.consumes(r8)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1
            r1 = 0
            r5.<init>(r9, r8, r1)
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r1 = r10
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop$default(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.CoroutineContext r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.drop(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.coroutines.CoroutineContext r9, kotlin.jvm.functions.Function2 r10) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.channels.ChannelsKt.consumes(r8)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1
            r1 = 0
            r5.<init>(r8, r10, r1)
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r1 = r9
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.dropWhile(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel r10, int r11, kotlin.coroutines.Continuation r12) {
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01281
            if (r0 == 0) goto L13
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "ReceiveChannel doesn't contain element at index "
            r4 = 46
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 != r5) goto L38
            int r10 = r0.I$1
            int r11 = r0.I$0
            kotlinx.coroutines.channels.ChannelIterator r2 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L35
            goto L5f
        L35:
            r10 = move-exception
            goto Lac
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L40:
            kotlin.ResultKt.throwOnFailure(r12)
            if (r11 < 0) goto L8f
            r12 = 0
            kotlinx.coroutines.channels.ChannelIterator r2 = r10.iterator()     // Catch: java.lang.Throwable -> La7
        L4a:
            r0.L$0 = r10     // Catch: java.lang.Throwable -> La7
            r0.L$1 = r2     // Catch: java.lang.Throwable -> La7
            r0.I$0 = r11     // Catch: java.lang.Throwable -> La7
            r0.I$1 = r12     // Catch: java.lang.Throwable -> La7
            r0.label = r5     // Catch: java.lang.Throwable -> La7
            java.lang.Object r6 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> La7
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r9 = r6
            r6 = r10
            r10 = r12
            r12 = r9
        L5f:
            r7 = 0
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L35
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto L77
            java.lang.Object r12 = r2.next()     // Catch: java.lang.Throwable -> L35
            int r8 = r10 + 1
            if (r11 != r10) goto L74
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            return r12
        L74:
            r10 = r6
            r12 = r8
            goto L4a
        L77:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r12.<init>()     // Catch: java.lang.Throwable -> L35
            r12.append(r3)     // Catch: java.lang.Throwable -> L35
            r12.append(r11)     // Catch: java.lang.Throwable -> L35
            r12.append(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L35
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L35
            throw r10     // Catch: java.lang.Throwable -> L35
        L8f:
            java.lang.IndexOutOfBoundsException r12 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r0.<init>()     // Catch: java.lang.Throwable -> La7
            r0.append(r3)     // Catch: java.lang.Throwable -> La7
            r0.append(r11)     // Catch: java.lang.Throwable -> La7
            r0.append(r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> La7
            r12.<init>(r11)     // Catch: java.lang.Throwable -> La7
            throw r12     // Catch: java.lang.Throwable -> La7
        La7:
            r11 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
            r6 = r11
        Lac:
            throw r10     // Catch: java.lang.Throwable -> Lad
        Lad:
            r11 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r10)
            throw r11
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel r8, int r9, kotlin.coroutines.Continuation r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01291
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            int r8 = r0.I$1
            int r9 = r0.I$0
            kotlinx.coroutines.channels.ChannelIterator r2 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L36
            r7 = r10
            r10 = r8
            r8 = r5
            r5 = r7
            goto L5f
        L36:
            r8 = move-exception
            goto L7e
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            kotlin.ResultKt.throwOnFailure(r10)
            if (r9 >= 0) goto L49
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r3)
            return r3
        L49:
            r10 = 0
            kotlinx.coroutines.channels.ChannelIterator r2 = r8.iterator()     // Catch: java.lang.Throwable -> L79
        L4e:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L79
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L79
            r0.I$0 = r9     // Catch: java.lang.Throwable -> L79
            r0.I$1 = r10     // Catch: java.lang.Throwable -> L79
            r0.label = r4     // Catch: java.lang.Throwable -> L79
            java.lang.Object r5 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> L79
            if (r5 != r1) goto L5f
            return r1
        L5f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L79
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L75
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L79
            int r6 = r10 + 1
            if (r9 != r10) goto L73
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r3)
            return r5
        L73:
            r10 = r6
            goto L4e
        L75:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r3)
            return r3
        L79:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            r5 = r9
        L7e:
            throw r8     // Catch: java.lang.Throwable -> L7f
        L7f:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r8)
            throw r9
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filter(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r10) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.channels.ChannelsKt.consumes(r8)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1
            r1 = 0
            r5.<init>(r8, r10, r1)
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r1 = r9
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filter$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filter(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.coroutines.CoroutineContext r9, kotlin.jvm.functions.Function3 r10) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.channels.ChannelsKt.consumes(r8)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1
            r1 = 0
            r5.<init>(r8, r10, r1)
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r1 = r9
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filterIndexed(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot(kotlinx.coroutines.channels.ReceiveChannel r2, kotlin.coroutines.CoroutineContext r3, kotlin.jvm.functions.Function2 r4) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1
            r1 = 0
            r0.<init>(r4, r1)
            kotlinx.coroutines.channels.ReceiveChannel r2 = kotlinx.coroutines.channels.ChannelsKt.filter(r2, r3, r0)
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filterNot(r0, r1, r2)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filterNotNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r3) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1
            r1 = 0
            r0.<init>(r1)
            r2 = 1
            kotlinx.coroutines.channels.ReceiveChannel r3 = kotlinx.coroutines.channels.ChannelsKt.filter$default(r3, r1, r0, r2, r1)
            return r3
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r6, java.util.Collection r7, kotlin.coroutines.Continuation r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01341
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            kotlinx.coroutines.channels.ChannelIterator r6 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r7 = r0.L$1
            java.util.Collection r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L35
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r2
        L32:
            r2 = r1
            r1 = r5
            goto L59
        L35:
            r6 = move-exception
            goto L79
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L75
        L46:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L75
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L75
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L75
            r0.label = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L75
            if (r2 != r1) goto L55
            return r1
        L55:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L32
        L59:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L75
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L6f
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L6b
            r7.add(r8)     // Catch: java.lang.Throwable -> L75
        L6b:
            r8 = r0
            r0 = r1
            r1 = r2
            goto L46
        L6f:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L75
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r4)
            return r7
        L75:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L79:
            throw r6     // Catch: java.lang.Throwable -> L7a
        L7a:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r7, kotlinx.coroutines.channels.SendChannel r8, kotlin.coroutines.Continuation r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L4f
            if (r2 == r3) goto L3d
            if (r2 != r4) goto L35
            kotlinx.coroutines.channels.ChannelIterator r7 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r8 = r0.L$1
            kotlinx.coroutines.channels.SendChannel r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L4d
            r9 = r7
            r7 = r8
            r8 = r2
            goto L56
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlinx.coroutines.channels.ChannelIterator r7 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r8 = r0.L$1
            kotlinx.coroutines.channels.SendChannel r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L4d
            r6 = r0
            r0 = r7
            r7 = r8
            r8 = r2
        L4a:
            r2 = r1
            r1 = r6
            goto L69
        L4d:
            r7 = move-exception
            goto L95
        L4f:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L91
        L56:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L91
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L91
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L91
            r0.label = r3     // Catch: java.lang.Throwable -> L91
            java.lang.Object r2 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> L91
            if (r2 != r1) goto L65
            return r1
        L65:
            r6 = r0
            r0 = r9
            r9 = r2
            goto L4a
        L69:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L91
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L91
            if (r9 == 0) goto L8b
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L91
            if (r9 == 0) goto L87
            r1.L$0 = r8     // Catch: java.lang.Throwable -> L91
            r1.L$1 = r7     // Catch: java.lang.Throwable -> L91
            r1.L$2 = r0     // Catch: java.lang.Throwable -> L91
            r1.label = r4     // Catch: java.lang.Throwable -> L91
            java.lang.Object r9 = r8.send(r9, r1)     // Catch: java.lang.Throwable -> L91
            if (r9 != r2) goto L87
            return r2
        L87:
            r9 = r0
            r0 = r1
            r1 = r2
            goto L56
        L8b:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L91
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r5)
            return r8
        L91:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L95:
            throw r7     // Catch: java.lang.Throwable -> L96
        L96:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel r5, kotlin.coroutines.Continuation r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01351
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlinx.coroutines.channels.ChannelIterator r5 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L6b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.channels.ChannelIterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L68
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L68
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L68
            r0.label = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L68
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4f:
            r1 = 0
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L60
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L2d
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r1)
            return r5
        L60:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2d
            throw r5     // Catch: java.lang.Throwable -> L2d
        L68:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6b:
            throw r5     // Catch: java.lang.Throwable -> L6c
        L6c:
            r6 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            throw r6
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel r5, kotlin.coroutines.Continuation r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01361
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlinx.coroutines.channels.ChannelIterator r5 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L67
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.channels.ChannelIterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L64
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L64
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L64
            r0.label = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L64
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r6 != 0) goto L5c
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r1)
            return r1
        L5c:
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L2d
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r1)
            return r5
        L64:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L67:
            throw r5     // Catch: java.lang.Throwable -> L68
        L68:
            r6 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            throw r6
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.coroutines.CoroutineContext r9, kotlin.jvm.functions.Function2 r10) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.channels.ChannelsKt.consumes(r8)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1
            r1 = 0
            r5.<init>(r8, r10, r1)
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r1 = r9
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.flatMap(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, kotlin.coroutines.Continuation r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01381
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01381) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            kotlinx.coroutines.channels.ChannelIterator r7 = r0.L$3
            kotlinx.coroutines.channels.ReceiveChannel r8 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r2 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L35
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
            goto L60
        L35:
            r7 = move-exception
            goto L94
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L90
        L4b:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L90
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L90
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L90
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L90
            r0.label = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r4 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> L90
            if (r4 != r1) goto L5c
            return r1
        L5c:
            r6 = r2
            r2 = r9
            r9 = r4
            r4 = r6
        L60:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L90
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L90
            if (r9 == 0) goto L85
            java.lang.Object r9 = r4.next()     // Catch: java.lang.Throwable -> L90
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)     // Catch: java.lang.Throwable -> L90
            if (r9 == 0) goto L7d
            int r8 = r2.element     // Catch: java.lang.Throwable -> L90
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)     // Catch: java.lang.Throwable -> L90
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r5)
            return r8
        L7d:
            int r9 = r2.element     // Catch: java.lang.Throwable -> L90
            int r9 = r9 + r3
            r2.element = r9     // Catch: java.lang.Throwable -> L90
            r9 = r2
            r2 = r4
            goto L4b
        L85:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L90
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r5)
            r7 = -1
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            return r7
        L90:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L94:
            throw r7     // Catch: java.lang.Throwable -> L95
        L95:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.Continuation r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01391
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01391) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L4b
            if (r2 == r3) goto L41
            if (r2 != r4) goto L39
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r3 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L36
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
            goto L81
        L36:
            r7 = move-exception
            goto La6
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            kotlinx.coroutines.channels.ChannelIterator r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L49
            goto L63
        L49:
            r7 = move-exception
            goto L9f
        L4b:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> La1
            r0.L$0 = r7     // Catch: java.lang.Throwable -> La1
            r0.L$1 = r8     // Catch: java.lang.Throwable -> La1
            r0.label = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> La1
            if (r2 != r1) goto L5f
            return r1
        L5f:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L63:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L49
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L49
            if (r8 == 0) goto L97
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L49
            r6 = r2
            r2 = r7
            r7 = r6
        L72:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> La1
            r0.L$1 = r2     // Catch: java.lang.Throwable -> La1
            r0.L$2 = r8     // Catch: java.lang.Throwable -> La1
            r0.label = r4     // Catch: java.lang.Throwable -> La1
            java.lang.Object r3 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> La1
            if (r3 != r1) goto L81
            return r1
        L81:
            r5 = 0
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L93
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L93
            if (r3 == 0) goto L8f
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L93
            goto L72
        L8f:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r5)
            return r8
        L93:
            r8 = move-exception
            r3 = r7
            r7 = r8
            goto La6
        L97:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L49
            java.lang.String r8 = "ReceiveChannel is empty."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L49
            throw r7     // Catch: java.lang.Throwable -> L49
        L9f:
            r3 = r2
            goto La6
        La1:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
            r3 = r8
        La6:
            throw r7     // Catch: java.lang.Throwable -> La7
        La7:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r7)
            throw r8
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel r8, java.lang.Object r9, kotlin.coroutines.Continuation r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01401
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01401) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            kotlinx.coroutines.channels.ChannelIterator r8 = r0.L$4
            kotlinx.coroutines.channels.ReceiveChannel r9 = r0.L$3
            kotlin.jvm.internal.Ref$IntRef r2 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r4 = r0.L$1
            java.lang.Object r5 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L37
            r7 = r5
            r5 = r8
            r8 = r9
            r9 = r7
            goto L6c
        L37:
            r8 = move-exception
            goto L9b
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.jvm.internal.Ref$IntRef r10 = new kotlin.jvm.internal.Ref$IntRef
            r10.<init>()
            r2 = -1
            r10.element = r2
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.channels.ChannelIterator r4 = r8.iterator()     // Catch: java.lang.Throwable -> L97
        L55:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L97
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L97
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L97
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L97
            r0.L$4 = r4     // Catch: java.lang.Throwable -> L97
            r0.label = r3     // Catch: java.lang.Throwable -> L97
            java.lang.Object r5 = r4.hasNext(r0)     // Catch: java.lang.Throwable -> L97
            if (r5 != r1) goto L68
            return r1
        L68:
            r7 = r4
            r4 = r10
            r10 = r5
            r5 = r7
        L6c:
            r6 = 0
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L97
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L97
            if (r10 == 0) goto L8b
            java.lang.Object r10 = r5.next()     // Catch: java.lang.Throwable -> L97
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)     // Catch: java.lang.Throwable -> L97
            if (r10 == 0) goto L83
            int r10 = r2.element     // Catch: java.lang.Throwable -> L97
            r4.element = r10     // Catch: java.lang.Throwable -> L97
        L83:
            int r10 = r2.element     // Catch: java.lang.Throwable -> L97
            int r10 = r10 + r3
            r2.element = r10     // Catch: java.lang.Throwable -> L97
            r10 = r4
            r4 = r5
            goto L55
        L8b:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L97
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r6)
            int r8 = r4.element
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            return r8
        L97:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L9b:
            throw r8     // Catch: java.lang.Throwable -> L9c
        L9c:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r8)
            throw r10
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.Continuation r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01411
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01411) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L4c
            if (r2 == r3) goto L42
            if (r2 != r5) goto L3a
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r3 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L37
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
            goto L86
        L37:
            r7 = move-exception
            goto La2
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            kotlinx.coroutines.channels.ChannelIterator r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L4a
            goto L64
        L4a:
            r7 = move-exception
            goto L9b
        L4c:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> L9d
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9d
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9d
            r0.label = r3     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L9d
            if (r2 != r1) goto L60
            return r1
        L60:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L64:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4a
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r8 != 0) goto L70
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r4)
            return r4
        L70:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4a
            r6 = r2
            r2 = r7
            r7 = r6
        L77:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9d
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L9d
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L9d
            r0.label = r5     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r3 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> L9d
            if (r3 != r1) goto L86
            return r1
        L86:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L97
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto L93
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L97
            goto L77
        L93:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r4)
            return r8
        L97:
            r8 = move-exception
            r3 = r7
            r7 = r8
            goto La2
        L9b:
            r3 = r2
            goto La2
        L9d:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
            r3 = r8
        La2:
            throw r7     // Catch: java.lang.Throwable -> La3
        La3:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r7)
            throw r8
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> map(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r10) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.channels.ChannelsKt.consumes(r8)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1
            r1 = 0
            r5.<init>(r8, r10, r1)
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r1 = r9
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel map$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.map(r0, r1, r2)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> mapIndexed(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r10) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.channels.ChannelsKt.consumes(r8)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1
            r1 = 0
            r5.<init>(r8, r10, r1)
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r1 = r9
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexed$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.mapIndexed(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.mapIndexed(r0, r1, r2)
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filterNotNull(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.mapIndexedNotNull(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.map(r0, r1, r2)
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filterNotNull(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.mapNotNull(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, kotlin.coroutines.Continuation r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01441
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01441) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L51
            if (r2 == r3) goto L44
            if (r2 != r5) goto L3c
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.channels.ChannelIterator r9 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r2 = r0.L$1
            java.util.Comparator r3 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L39
            r7 = r10
            r10 = r8
            r8 = r2
            r2 = r7
            goto L91
        L39:
            r8 = move-exception
            goto Lae
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            kotlinx.coroutines.channels.ChannelIterator r8 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r9 = r0.L$1
            java.util.Comparator r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L4e
            goto L6c
        L4e:
            r8 = move-exception
            goto Lad
        L51:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> La9
            r0.L$0 = r9     // Catch: java.lang.Throwable -> La9
            r0.L$1 = r8     // Catch: java.lang.Throwable -> La9
            r0.L$2 = r10     // Catch: java.lang.Throwable -> La9
            r0.label = r3     // Catch: java.lang.Throwable -> La9
            java.lang.Object r2 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> La9
            if (r2 != r1) goto L67
            return r1
        L67:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r2
            r2 = r7
        L6c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L4e
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r10 != 0) goto L78
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r4)
            return r4
        L78:
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L4e
            r3 = r2
            r7 = r9
            r9 = r8
            r8 = r7
        L80:
            r0.L$0 = r3     // Catch: java.lang.Throwable -> La9
            r0.L$1 = r8     // Catch: java.lang.Throwable -> La9
            r0.L$2 = r9     // Catch: java.lang.Throwable -> La9
            r0.L$3 = r10     // Catch: java.lang.Throwable -> La9
            r0.label = r5     // Catch: java.lang.Throwable -> La9
            java.lang.Object r2 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> La9
            if (r2 != r1) goto L91
            return r1
        L91:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> La9
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> La9
            if (r2 == 0) goto La5
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> La9
            int r6 = r3.compare(r10, r2)     // Catch: java.lang.Throwable -> La9
            if (r6 >= 0) goto L80
            r10 = r2
            goto L80
        La5:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r10
        La9:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Lad:
            r2 = r9
        Lae:
            throw r8     // Catch: java.lang.Throwable -> Laf
        Laf:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r8)
            throw r9
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, kotlin.coroutines.Continuation r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01451
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01451) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L51
            if (r2 == r3) goto L44
            if (r2 != r5) goto L3c
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.channels.ChannelIterator r9 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r2 = r0.L$1
            java.util.Comparator r3 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L39
            r7 = r10
            r10 = r8
            r8 = r2
            r2 = r7
            goto L91
        L39:
            r8 = move-exception
            goto Lae
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            kotlinx.coroutines.channels.ChannelIterator r8 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r9 = r0.L$1
            java.util.Comparator r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L4e
            goto L6c
        L4e:
            r8 = move-exception
            goto Lad
        L51:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> La9
            r0.L$0 = r9     // Catch: java.lang.Throwable -> La9
            r0.L$1 = r8     // Catch: java.lang.Throwable -> La9
            r0.L$2 = r10     // Catch: java.lang.Throwable -> La9
            r0.label = r3     // Catch: java.lang.Throwable -> La9
            java.lang.Object r2 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> La9
            if (r2 != r1) goto L67
            return r1
        L67:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r2
            r2 = r7
        L6c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L4e
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r10 != 0) goto L78
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r4)
            return r4
        L78:
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L4e
            r3 = r2
            r7 = r9
            r9 = r8
            r8 = r7
        L80:
            r0.L$0 = r3     // Catch: java.lang.Throwable -> La9
            r0.L$1 = r8     // Catch: java.lang.Throwable -> La9
            r0.L$2 = r9     // Catch: java.lang.Throwable -> La9
            r0.L$3 = r10     // Catch: java.lang.Throwable -> La9
            r0.label = r5     // Catch: java.lang.Throwable -> La9
            java.lang.Object r2 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> La9
            if (r2 != r1) goto L91
            return r1
        L91:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> La9
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> La9
            if (r2 == 0) goto La5
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> La9
            int r6 = r3.compare(r10, r2)     // Catch: java.lang.Throwable -> La9
            if (r6 <= 0) goto L80
            r10 = r2
            goto L80
        La5:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r10
        La9:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Lad:
            r2 = r9
        Lae:
            throw r8     // Catch: java.lang.Throwable -> Laf
        Laf:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r8)
            throw r9
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel r4, kotlin.coroutines.Continuation r5) {
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01461
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01461) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlinx.coroutines.channels.ReceiveChannel r4 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L58
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.channels.ChannelIterator r5 = r4.iterator()     // Catch: java.lang.Throwable -> L58
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L58
            r0.label = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r5 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L58
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = 0
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L58
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L58
            if (r5 != 0) goto L4f
            goto L50
        L4f:
            r3 = 0
        L50:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)     // Catch: java.lang.Throwable -> L58
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r0)
            return r5
        L58:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Left for binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel requireNoNulls(kotlinx.coroutines.channels.ReceiveChannel r3) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1
            r1 = 0
            r0.<init>(r3, r1)
            r2 = 1
            kotlinx.coroutines.channels.ReceiveChannel r3 = kotlinx.coroutines.channels.ChannelsKt.map$default(r3, r1, r0, r2, r1)
            return r3
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.coroutines.Continuation r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01481
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L30
            goto L7c
        L30:
            r6 = move-exception
            goto L9e
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            kotlinx.coroutines.channels.ReceiveChannel r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L45
            goto L5f
        L45:
            r6 = move-exception
            goto L99
        L47:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9b
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9b
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9b
            r0.label = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L9b
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L5f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L45
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L91
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L45
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L45
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L45
            r0.label = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r6 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L45
            if (r6 != r1) goto L78
            return r1
        L78:
            r0 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L7c:
            r1 = 0
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L30
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L30
            if (r7 != 0) goto L89
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r1)
            return r6
        L89:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "ReceiveChannel has more than one element."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L30
            throw r6     // Catch: java.lang.Throwable -> L30
        L91:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L45
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L45
            throw r6     // Catch: java.lang.Throwable -> L45
        L99:
            r0 = r2
            goto L9e
        L9b:
            r7 = move-exception
            r0 = r6
            r6 = r7
        L9e:
            throw r6     // Catch: java.lang.Throwable -> L9f
        L9f:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r6)
            throw r7
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.Continuation r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01491
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L31
            goto L81
        L31:
            r7 = move-exception
            goto L96
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            kotlinx.coroutines.channels.ReceiveChannel r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L46
            goto L60
        L46:
            r7 = move-exception
            goto L91
        L48:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> L93
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L93
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L93
            r0.label = r4     // Catch: java.lang.Throwable -> L93
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L93
            if (r2 != r1) goto L5c
            return r1
        L5c:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L60:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L46
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L46
            if (r8 != 0) goto L6c
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r5)
            return r5
        L6c:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L46
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L46
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L46
            r0.label = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r7 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L46
            if (r7 != r1) goto L7d
            return r1
        L7d:
            r0 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L81:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L31
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L8d
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            return r5
        L8d:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            return r7
        L91:
            r0 = r2
            goto L96
        L93:
            r8 = move-exception
            r0 = r7
            r7 = r8
        L96:
            throw r7     // Catch: java.lang.Throwable -> L97
        L97:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r7)
            throw r8
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take(kotlinx.coroutines.channels.ReceiveChannel r8, int r9, kotlin.coroutines.CoroutineContext r10) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.channels.ChannelsKt.consumes(r8)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1
            r1 = 0
            r5.<init>(r9, r8, r1)
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r1 = r10
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take$default(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.CoroutineContext r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.take(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.coroutines.CoroutineContext r9, kotlin.jvm.functions.Function2 r10) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.channels.ChannelsKt.consumes(r8)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1
            r1 = 0
            r5.<init>(r8, r10, r1)
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r1 = r9
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.takeWhile(r0, r1, r2)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r7, @org.jetbrains.annotations.NotNull C r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super C> r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01521
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L47
            if (r2 == r3) goto L3d
            if (r2 != r4) goto L35
            kotlinx.coroutines.channels.ChannelIterator r7 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r8 = r0.L$1
            kotlinx.coroutines.channels.SendChannel r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L7e
        L31:
            r9 = r7
            r7 = r8
            r8 = r2
            goto L4e
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlinx.coroutines.channels.ChannelIterator r7 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r8 = r0.L$1
            kotlinx.coroutines.channels.SendChannel r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L7e
            goto L62
        L47:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L86
        L4e:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L86
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L86
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L86
            r0.label = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r2
            r2 = r6
        L62:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L7e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L7e
            if (r9 == 0) goto L80
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L7e
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L7e
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L7e
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L7e
            r0.label = r4     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r9 = r2.send(r9, r0)     // Catch: java.lang.Throwable -> L7e
            if (r9 != r1) goto L31
            return r1
        L7e:
            r7 = move-exception
            goto L8a
        L80:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7e
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r5)
            return r2
        L86:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L8a:
            throw r7     // Catch: java.lang.Throwable -> L8b
        L8b:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, @org.jetbrains.annotations.NotNull C r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super C> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01531
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            kotlinx.coroutines.channels.ChannelIterator r6 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r7 = r0.L$1
            java.util.Collection r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L35
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r2
        L32:
            r2 = r1
            r1 = r5
            goto L59
        L35:
            r6 = move-exception
            goto L77
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L73
        L46:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L73
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L73
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L73
            r0.label = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L73
            if (r2 != r1) goto L55
            return r1
        L55:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L32
        L59:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L73
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L73
            if (r8 == 0) goto L6d
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L73
            r7.add(r8)     // Catch: java.lang.Throwable -> L73
            r8 = r0
            r0 = r1
            r1 = r2
            goto L46
        L6d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L73
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r4)
            return r7
        L73:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L77:
            throw r6     // Catch: java.lang.Throwable -> L78
        L78:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> r6, @org.jetbrains.annotations.NotNull M r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super M> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            kotlinx.coroutines.channels.ChannelIterator r6 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r7 = r0.L$1
            java.util.Map r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L35
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r2
        L32:
            r2 = r1
            r1 = r5
            goto L59
        L35:
            r6 = move-exception
            goto L81
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7d
        L46:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L7d
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L7d
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L7d
            r0.label = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L7d
            if (r2 != r1) goto L55
            return r1
        L55:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L32
        L59:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L7d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto L77
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L7d
            kotlin.Pair r8 = (kotlin.Pair) r8     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r4 = r8.getFirst()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r8 = r8.getSecond()     // Catch: java.lang.Throwable -> L7d
            r7.put(r4, r8)     // Catch: java.lang.Throwable -> L7d
            r8 = r0
            r0 = r1
            r1 = r2
            goto L46
        L77:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7d
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r4)
            return r7
        L7d:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L81:
            throw r6     // Catch: java.lang.Throwable -> L82
        L82:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Object r1 = kotlinx.coroutines.channels.ChannelsKt.toMap(r1, r0, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toMutableList(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = kotlinx.coroutines.channels.ChannelsKt.toCollection(r1, r0, r2)
            return r1
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <E> java.lang.Object toMutableSet(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Set<E>> r2) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.Object r1 = kotlinx.coroutines.channels.ChannelsKt.toCollection(r1, r0, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toSet(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toMutableSet(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.coroutines.CoroutineContext r9) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.channels.ChannelsKt.consumes(r8)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1
            r1 = 0
            r5.<init>(r8, r1)
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r1 = r9
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.withIndex(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel zip(kotlinx.coroutines.channels.ReceiveChannel r6, kotlinx.coroutines.channels.ReceiveChannel r7) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$1 r3 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01551.INSTANCE
            r2 = 0
            r4 = 2
            r5 = 0
            r0 = r6
            r1 = r7
            kotlinx.coroutines.channels.ReceiveChannel r6 = kotlinx.coroutines.channels.ChannelsKt.zip$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E, R, V> kotlinx.coroutines.channels.ReceiveChannel<V> zip(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r8, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends R> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = 2
            kotlinx.coroutines.channels.ReceiveChannel[] r1 = new kotlinx.coroutines.channels.ReceiveChannel[r1]
            r2 = 0
            r1[r2] = r8
            r2 = 1
            r1[r2] = r9
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.channels.ChannelsKt.consumesAll(r1)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2
            r1 = 0
            r5.<init>(r9, r8, r11, r1)
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r1 = r10
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel zip$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L8
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getUnconfined()
        L8:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.zip(r0, r1, r2, r3)
            return r0
    }
}
