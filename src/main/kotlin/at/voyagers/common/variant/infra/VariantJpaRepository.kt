package at.voyagers.common.variant.infra

import at.voyagers.common.variant.domain.repostiroy.VariantRepository
import org.springframework.stereotype.Repository

@Repository
class VariantJpaRepository(
    // interface
): VariantRepository {
}

//interface VariantEntityRepository: JpaRepository<Variant, Long>
