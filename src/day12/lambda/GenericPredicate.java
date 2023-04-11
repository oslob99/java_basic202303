package day12.lambda;

@FunctionalInterface
public interface GenericPredicate<T> {

    // 지정된 타입에 대한 섬사를 수행
    boolean test(T t);
}
