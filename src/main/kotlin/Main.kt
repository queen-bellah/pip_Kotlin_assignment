//class RecommendationSystem(private val stock: Map<String, Array<String>>) {
//    fun getRecommendations(category: String): Array<String>? {
//        return stock[category] } }
//
//fun main() {
//val stock = mapOf( "Electronics" to arrayOf("Laptop", "Smartphone", "Headphones", "TV"), "Fashion" to arrayOf("T-shirt", "Watch", "Shoes") )
//val recommendationSystem = RecommendationSystem(stock)
//val preferredCategory = "Electronics"
//val recommendations = recommendationSystem.getRecommendations(preferredCategory)
//println("Recommended items in the $preferredCategory category: ${recommendations.contentToString()}" )
//}

fun main() { //

     val pageVisitTracker = PageVisitTracker()

    pageVisitTracker.trackPageVisit("Mentee's Profile")
    pageVisitTracker.trackPageVisit("Mentor's Profile")
    pageVisitTracker.trackPageVisit("Mentor's Profile")
    pageVisitTracker.trackPageVisit("Mentor's Profile")
    pageVisitTracker.trackPageVisit("Mentor's Profile")

    pageVisitTracker.trackPageVisit("Home")
     pageVisitTracker.trackPageVisit("Promo")
    pageVisitTracker.trackPageVisit("Promo")
     pageVisitTracker.trackPageVisit("home")

     val topVisitedPages = pageVisitTracker.getTopPages()

     println(topVisitedPages) }
     class PageVisitTracker {


    private val pageVisits = mutableMapOf<String, Int>()

     fun trackPageVisit(page: String) {

     pageVisits[page] = pageVisits.getOrDefault(page, 0) + 1 }

     fun getTopPages(): List<Pair<String, Int>> {

    return pageVisits.toList().sortedByDescending { it.second }.take(5) } }