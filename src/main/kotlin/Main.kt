class RecommendationSystem(private val stock: Map<String, Array<String>>) {
    fun getRecommendations(category: String): Array<String>? {
        return stock[category] } }

fun main() {
val stock = mapOf( "Electronics" to arrayOf("Laptop", "Smartphone", "Headphones", "TV"), "Fashion" to arrayOf("T-shirt", "Watch", "Shoes") )
val recommendationSystem = RecommendationSystem(stock)
val preferredCategory = "Electronics"
val recommendations = recommendationSystem.getRecommendations(preferredCategory)
println("Recommended items in the $preferredCategory category: ${recommendations.contentToString()}" )
}
