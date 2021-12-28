package cn.lessann.test.javaSE16.Immutable;

import com.sun.tools.javac.util.List;

public class Demo {
    public static void main(String[] args) {
        // 创建不可变List
        List<Integer> lisOf = List.of(1, 2, 3, 4);
        // 只可以获取，不可以删，改和增
        System.out.println(lisOf.get(0));

        // 2、不可变的Set集合,jdk版本需要高于8
        // Set<String> names = Set.of("迪丽热巴", "迪丽热九", "马尔扎哈", "卡尔眨巴" );
        // names.add("三少爷");
        // System.out.println(names);

        // 3、不可变的Map集合,jdk版本需要高于8
        // Map<String, Integer> maps = Map.of("huawei",2, "Java开发", 1 , "手表", 1);
        // maps.put("衣服", 3);
        // System.out.println(maps);

    }
}
