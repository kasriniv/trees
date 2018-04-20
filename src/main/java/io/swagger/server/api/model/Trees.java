package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The root of the trees type&#39;s schema.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Trees   {
  
  private String name = null;
  private String category = null;
  private Integer id = null;
  private String region = null;
  private String product = null;

  public Trees () {

  }

  public Trees (String name, String category, Integer id, String region, String product) {
    this.name = name;
    this.category = category;
    this.id = id;
    this.region = region;
    this.product = product;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

    
  @JsonProperty("product")
  public String getProduct() {
    return product;
  }
  public void setProduct(String product) {
    this.product = product;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trees trees = (Trees) o;
    return Objects.equals(name, trees.name) &&
        Objects.equals(category, trees.category) &&
        Objects.equals(id, trees.id) &&
        Objects.equals(region, trees.region) &&
        Objects.equals(product, trees.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category, id, region, product);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trees {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
