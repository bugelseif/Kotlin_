package oo.heranca

class Ferrari : Carro(velocidadeMaxima = 350), Esportivo{
    override var turbo: Boolean = false
        get() = field
        set(value) { field = value }

    override fun acelerar() {
        super.alterarVelocidade(if(turbo) 50 else 25)
    }

    override fun frear() {
        super.alterarVelocidade(-25)
    }
}