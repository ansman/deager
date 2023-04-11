package se.ansman.dagger.auto.compiler.processing

import se.ansman.dagger.auto.compiler.TypeLookup
import kotlin.reflect.KClass

interface AutoDaggerResolver<N, TypeName, ClassName : TypeName, AnnotationSpec> {
    val environment: AutoDaggerEnvironment<N, TypeName, ClassName, AnnotationSpec, *>
    val typeLookup: TypeLookup<ClassDeclaration<N, TypeName, ClassName, AnnotationSpec>>

    fun nodesAnnotatedWith(annotation: KClass<out Annotation>): Sequence<Node<N, TypeName, ClassName, AnnotationSpec>>
    fun lookupType(className: ClassName): ClassDeclaration<N, TypeName, ClassName, AnnotationSpec>
}