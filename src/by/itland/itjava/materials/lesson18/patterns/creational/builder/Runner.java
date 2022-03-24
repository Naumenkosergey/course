package by.itland.itjava.materials.lesson18.patterns.creational.builder;

public class Runner {
    public static void main(String[] args) {

        WebSite visitCardSite = new VisitCardWebSite()
                .name("Visit Card")
                .cms(Cms.WORDPRES)
                .price(500)
                .build();
        WebSite enterpriseWebSite = new EnterpriseWebSite()
                .name("Enterprise")
//                .cms(Cms.ALIFRESCO)
                .price(10000)
                .build();

        System.out.println(visitCardSite);
        System.out.println("==========================");
        System.out.println(enterpriseWebSite);
    }
}
