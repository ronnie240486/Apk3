package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Migration.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a¸\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\n\"\u0004\b\u0004\u0010\u000b\"\u0004\b\u0005\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00070\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00032:\u0010\u0010\u001a6\b\u0001\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a\u009e\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\n\"\u0004\b\u0004\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00070\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\n0\u000324\u0010\u0010\u001a0\b\u0001\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0015H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0084\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00070\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u00032.\u0010\u0010\u001a*\b\u0001\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aj\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00070\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u00032(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001aI\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00040\u00032#\u0010\u001c\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00030\u001d¢\u0006\u0002\b\u001eH\u0007\u001a>\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00030\u001dH\u0007\u001a+\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010\"\u001a\u0002H\u0004H\u0007¢\u0006\u0002\u0010#\u001a,\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010%\u001a\u00020&H\u0007\u001a&\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010%\u001a\u00020&H\u0007\u001aV\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00040\u00032(\u0010 \u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00030\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130)H\u0007ø\u0001\u0000¢\u0006\u0002\u0010*\u001a$\u0010+\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0003H\u0007\u001aS\u0010,\u001a\u00020-\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u000321\u0010.\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130)H\u0007ø\u0001\u0000¢\u0006\u0002\u00101\u001a$\u00102\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0003H\u0007\u001a&\u00103\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u00104\u001a\u000205H\u0007\u001a,\u00106\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\f\u00107\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a,\u00108\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\f\u00107\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a+\u00109\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u00107\u001a\u0002H\u0004H\u0007¢\u0006\u0002\u0010#\u001aA\u00109\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u00107\u001a\u0002H\u00042\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0\u001dH\u0007¢\u0006\u0002\u0010=\u001a\u001e\u0010>\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a&\u0010>\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010?\u001a\u00020@H\u0007\u001a&\u0010A\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u00104\u001a\u000205H\u0007\u001a\u001e\u0010B\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a&\u0010B\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010?\u001a\u00020@H\u0007\u001a~\u0010C\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010D\u001a\u0002H\u00062H\b\u0001\u0010E\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0006¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(F\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010G\u001an\u0010H\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032F\u0010E\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(F\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010I\u001a&\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010K\u001a\u00020@H\u0007\u001a+\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010\"\u001a\u0002H\u0004H\u0007¢\u0006\u0002\u0010#\u001a,\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a\u0018\u0010M\u001a\u00020-\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001aD\u0010M\u001a\u00020-\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\"\u0010N\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130)H\u0007ø\u0001\u0000¢\u0006\u0002\u00101\u001ah\u0010M\u001a\u00020-\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\"\u0010N\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130)2\"\u0010O\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130)H\u0007ø\u0001\u0000¢\u0006\u0002\u0010P\u001a&\u0010Q\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u00104\u001a\u000205H\u0007\u001ae\u0010R\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00040\u000327\u0010\u0010\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00030\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130)H\u0007ø\u0001\u0000¢\u0006\u0002\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S"}, d2 = {"noImpl", "", "cache", "Lkotlinx/coroutines/flow/Flow;", "T", "combineLatest", "R", "T1", "T2", "T3", "T4", "T5", "other", "other2", "other3", "other4", "transform", "Lkotlin/Function6;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function5;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function4;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function3;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "compose", "transformer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "concatMap", "mapper", "concatWith", "value", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "delayEach", "timeMillis", "", "delayFlow", "flatMap", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "flatten", "forEach", "", "action", "Lkotlin/ParameterName;", "name", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)V", "merge", "observeOn", "context", "Lkotlin/coroutines/CoroutineContext;", "onErrorResume", "fallback", "onErrorResumeNext", "onErrorReturn", "predicate", "", "", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "publish", "bufferSize", "", "publishOn", "replay", "scanFold", "initial", "operation", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "scanReduce", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "skip", "count", "startWith", "subscribe", "onEach", "onError", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "subscribeOn", "switchMap", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__MigrationKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1, reason: invalid class name */
    /* JADX INFO: compiled from: Migration.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ long $timeMillis;
        public int label;

        public AnonymousClass1(long r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__MigrationKt.AnonymousClass1> r3) {
                r0 = this;
                r0.$timeMillis = r1
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1 r3 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1
                long r0 = r2.$timeMillis
                r3.<init>(r0, r4)
                return r3
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(T r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1 r1 = (kotlinx.coroutines.flow.FlowKt__MigrationKt.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
                long r3 = r5.$timeMillis
                r5.label = r2
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Migration.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
    public static final class C01641<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ long $timeMillis;
        public int label;

        public C01641(long r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__MigrationKt.C01641> r3) {
                r0 = this;
                r0.$timeMillis = r1
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1 r3 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1
                long r0 = r2.$timeMillis
                r3.<init>(r0, r4)
                return r3
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1 r1 = (kotlinx.coroutines.flow.FlowKt__MigrationKt.C01641) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
                long r3 = r5.$timeMillis
                r5.label = r2
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
        }
    }


    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2, reason: invalid class name */
    /* JADX INFO: compiled from: Migration.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "e", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super T>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ T $fallback;
        public final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Boolean> $predicate;
        private /* synthetic */ java.lang.Object L$0;
        public /* synthetic */ java.lang.Throwable L$1;
        public int label;

        public AnonymousClass2(kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r1, T r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__MigrationKt.AnonymousClass2> r3) {
                r0 = this;
                r0.$predicate = r1
                r0.$fallback = r2
                r1 = 3
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Throwable r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r0 = this;
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r1 = r0.invoke(r1, r2, r3)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r4, @org.jetbrains.annotations.NotNull java.lang.Throwable r5, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                r3 = this;
                kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2 r0 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2
                kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Boolean> r1 = r3.$predicate
                T r2 = r3.$fallback
                r0.<init>(r1, r2, r6)
                r0.L$0 = r4
                r0.L$1 = r5
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                java.lang.Object r4 = r0.invokeSuspend(r4)
                return r4
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r5)
                goto L3c
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.L$0
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                java.lang.Throwable r1 = r4.L$1
                kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Boolean> r3 = r4.$predicate
                java.lang.Object r3 = r3.invoke(r1)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L3f
                T r1 = r4.$fallback
                r3 = 0
                r4.L$0 = r3
                r4.label = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L3c
                return r0
            L3c:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L3f:
                throw r1
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> cache(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "this.combine(other, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> combineLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.combine(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.Flow<R> combineLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.combine(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.Flow<R> combineLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.combine(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.Flow<R> combineLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T5> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.combine(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @kotlin.ReplaceWith(expression = "let(transformer)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> compose(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.flow.Flow<? extends T>, ? extends kotlinx.coroutines.flow.Flow<? extends R>> r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> concatMap(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends kotlinx.coroutines.flow.Flow<? extends R>> r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @kotlin.ReplaceWith(expression = "onCompletion { emit(value) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> concatWith(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, T r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @kotlin.ReplaceWith(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> concatWith(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @kotlin.ReplaceWith(expression = "onEach { delay(timeMillis) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> delayEach(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r2, long r3) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1 r0 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1
            r1 = 0
            r0.<init>(r3, r1)
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.onEach(r2, r0)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { delay(timeMillis) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> delayFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r2, long r3) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1
            r1 = 0
            r0.<init>(r3, r1)
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.onStart(r2, r0)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMap(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flattenConcat()", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> flatten(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r0) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @kotlin.ReplaceWith(expression = "collect(action)", imports = {}))
    public static final <T> void forEach(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flattenConcat()", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r0) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Void noImpl() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not implemented, should not be called"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> observeOn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorResume(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorResumeNext(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emit(fallback) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorReturn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, T r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorReturn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r2, T r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r4) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2 r0 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2
            r1 = 0
            r0.<init>(r4, r3, r1)
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.m1844catch(r2, r0)
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow onErrorReturn$default(kotlinx.coroutines.flow.Flow r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$1 r2 = kotlinx.coroutines.flow.FlowKt__MigrationKt.C01651.INSTANCE
        L6:
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.onErrorReturn(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, 0)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> publish(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> publish(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, int r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> publishOn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> replay(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> replay(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, int r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @kotlin.ReplaceWith(expression = "scan(initial, operation)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> scanFold(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, R r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @kotlin.ReplaceWith(expression = "runningReduce(operation)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> scanReduce(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.runningReduce(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @kotlin.ReplaceWith(expression = "drop(count)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> skip(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, int r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { emit(value) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> startWith(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, T r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { emitAll(other) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> startWith(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> subscribeOn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @kotlin.ReplaceWith(expression = "this.flatMapLatest(transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> switchMap(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 r0 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1
            r1 = 0
            r0.<init>(r3, r1)
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.transformLatest(r2, r0)
            return r2
    }
}
